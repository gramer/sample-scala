package com.gramer.address

import org.specs._
import com.gramer.address._
import org.springframework.orm.jpa.vendor.Database

object AddressBookTest extends Specification {

    val book: AddressBook = new AddressBook(
        new Person("kkj", 10),
        new Person("lee", 30))

    "AddressBook " should {
        "find Adults" in {
            book.findAdults().length mustEqual 1
        }

        "find By Name" in {
            book.findByName("kkj").length mustEqual 1
            book.findByName("111").length mustEqual 0
        }

        "add" in {
            book.add(new Person("ppp", 33))
            book.findAll().length mustEqual 3
        }
    }
    
}