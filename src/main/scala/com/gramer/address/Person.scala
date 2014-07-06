package com.gramer.address

import scala.reflect.BeanProperty
import javax.persistence._
import java.util.Date

@Entity
@Table(name = "person")
class Person(n: String, d: Date, e: Option[String] = None) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @BeanProperty
    var id: Int = _

    @BeanProperty
    var name: String = n
    
    @BeanProperty
    var birthday: Date = d
    
    @BeanProperty    
    var email: String = e.getOrElse("")
    
    def age() = new Date().getYear - birthday.getYear() + 1
    
    def this() = this (null, null)

}
