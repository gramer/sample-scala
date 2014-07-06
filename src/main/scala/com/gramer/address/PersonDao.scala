package com.gramer.address

import javax.persistence.Entity
import javax.persistence.Table

trait PersonDao {
  def save(Person: Person): Unit

  def select(id: Int): Option[Person]

  def selectAll: List[Person]

  def selectByName(name: String): List[Person]

  def delete(id: Int): Unit
}