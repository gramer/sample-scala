package com.gramer.address

import java.util.Date

import org.springframework.context.support.ClassPathXmlApplicationContext

import javax.persistence.Entity
import javax.persistence.Table

object JpaScala {

    def main(args: Array[String]) {

        val ctx = new ClassPathXmlApplicationContext("application-context.xml")
        val dao: PersonDao = ctx.getBean(classOf[PersonDao])

        dao.save(new Person("김경준", new Date()))
        dao.save(new Person("김삼순", new Date()))
        dao.save(new Person("김사순", new Date()))
        dao.save(new Person("김오순", new Date()))
        dao.save(new Person("김육순", new Date()))

        println(dao.selectAll)
        println(dao.selectByName("김경준"))

        (1 to 10) foreach (y =>
            dao.select(y) match {
                case Some(x) => println(x)
                case None => println("No Person found with id " + y)
            })
    }

}