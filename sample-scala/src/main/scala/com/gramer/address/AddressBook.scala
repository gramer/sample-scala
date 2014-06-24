package com.gramer.address

class AddressBook(p: Person*) {
    private var people: List[Person] = p.toList

    def findAdults(): List[Person] = {
        people.filter((p: Person) => p.age > 20)
    }

    def add(p: Person): Unit = {
        people = people.+:(p)
    }

    def findAll(): List[Person] = people

    def findByName(n: String): List[Person] = {
        people.filter((p: Person) => p.name == n)
    }

}