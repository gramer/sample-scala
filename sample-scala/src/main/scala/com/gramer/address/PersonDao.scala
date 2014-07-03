package com.gramer.address

import javax.persistence.Entity
import javax.persistence.Table

trait PersonDao {
    def save(Person: Person): Unit

    def find(id: Int): Option[Person]

    def findAll: List[Person]

    def findByName(name : String): List[Person]
}