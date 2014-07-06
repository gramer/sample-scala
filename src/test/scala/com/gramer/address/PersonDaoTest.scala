package com.gramer.address

import java.util.Date

import org.joda.time.DateTime
import org.specs.Specification
import org.springframework.context.support.ClassPathXmlApplicationContext

object PersonDaoTest extends Specification {

    val ctx = new ClassPathXmlApplicationContext("application-context.xml")
    val dao: PersonDao = ctx.getBean(classOf[PersonDao])

    "PersonDao" should {
        "save person" in {
            createPersons.foreach((p) => dao.save(p))
            dao.selectAll.length mustEqual 2
        }
        
        "select by name" in {
            createPersons.foreach((p) => dao.save(p))
            dao.selectByName("kkj").length mustEqual 1
        }
        

        "delete person" in {
            createPersons.foreach((p) => dao.save(p))
            dao.delete(1)
            dao.selectAll.length mustEqual 1
        }

    }

    def createBirthday(year: Int): Date = {
        return new DateTime(year, 1, 1, 0, 0, 0).toDate
    }
    
    def createPersons():List[Person] = {
        List(
           new Person("kkj", createBirthday(1981)),
           new Person("김삼순", createBirthday(2013))
        )
    }

}