package com.gramer.address

class Person(n: String, a: Int, e: Option[String] = None) {
    
    var age: Int = a
    var name: String = n
    var email: String = e.getOrElse("")
}
