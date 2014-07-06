package com.gramer.address

import org.specs._
import com.gramer.address._
import org.springframework.orm.jpa.vendor.Database
import java.util.Date

object AddressBookTest extends Specification {

    val book: AddressBook = new AddressBook(
        new Person("kkj", createBirthday(1960)),
        new Person("lee", createBirthday(1991)))

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
    
    def createBirthday(year:Int):Date = {
        var result:Date = new Date()
        result.setYear(1981)
        
        return result
    }
    
}