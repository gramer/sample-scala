package com.gramer.customer

trait CustomerDao {
  def save(customer: Customer): Unit

  def select(id: Int): Option[Customer]

  def selectAll: List[Customer]

  def selectByLastName(lastName: String): List[Customer]

}