package com.gramer.address

import org.specs._
import com.gramer.address._

object AddressBookTest extends Specification {

    val book: AddressBook = new AddressBook(
        Person("kkj", 10),
        Person("lee", 30))

    "AddressBook " should {
        "find Adults" in {
            book.findAdults().length mustEqual 1
        }

        "find By Name" in {
            book.findByName("kkj").length mustEqual 1
            book.findByName("111").length mustEqual 0
        }

        "add" in {
            book.add(Person("ppp", 33))
            book.findAll().length mustEqual 3
        }
    }

}