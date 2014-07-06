package com.gramer.customer

trait CustomerDao {
    def save(customer: Customer): Unit

    def find(id: Int): Option[Customer]

    def getAll: List[Customer]

    def getByLastName(lastName : String): List[Customer]
}