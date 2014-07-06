package com.gramer.address

import com.gramer.address._
import org.specs._
import org.springframework.orm.jpa.vendor.Database
import java.util.Date
import org.joda.time.DateTime

object AddressBookTest extends Specification {

    val book: AddressBook = new AddressBook(
        new Person("kkj", createBirthday(1960)),
        new Person("lee", createBirthday(2014)))

    "AddressBook " should {
        "find Adults" in {
            book.findAdults().length mustEqual 1
        }

        "find By Name" in {
            book.findByName("kkj").length mustEqual 1
            book.findByName("111").length mustEqual 0
        }

        "add" in {
            book.add(new Person("ppp", new Date()))
            book.findAll().length mustEqual 3
        }
    }

    def createBirthday(year: Int): Date = {
        return new DateTime(year, 1, 1, 0, 0, 0).toDate
    }

}