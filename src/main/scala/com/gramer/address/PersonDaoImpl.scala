package com.gramer.address

import org.springframework.beans.factory.annotation._
import org.springframework.stereotype._
import org.springframework.transaction.annotation.{ Propagation, Transactional }
import javax.persistence._
import scala.collection.JavaConversions._

@Repository
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
class PersonDaoImpl extends PersonDao {

  @Autowired
  var entityManager: EntityManager = _

  def save(person: Person): Unit = person.id match {
    case 0 => entityManager.persist(person)
    case _ => entityManager.merge(person)
  }

  def select(id: Int): Option[Person] = entityManager.find(classOf[Person], id) match {
    case null => None
    case person => Some(person)
  }

  def selectAll: List[Person] = {
    entityManager.createQuery("From Person", classOf[Person]).getResultList.toList
  }

  def selectByName(name: String): List[Person] = {
    entityManager.createQuery("From Person Where name = :name", classOf[Person]).setParameter("name", name).getResultList.toList
  }

  def delete(id: Int): Unit = {
    var entity: Option[Person] = select(id);
    if (!entity.isEmpty) entityManager.remove(entity.get)
  }
}