package com.gramer.customer

import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * User: phildebrand
 * Created by IntelliJ IDEA.
 * Date: 4/5/11
 * Time: 11:02 AM
 * To change this template use File | Settings | File Templates.
 */

object JpaScala {

    def main(args: Array[String]) {

        val ctx = new ClassPathXmlApplicationContext("application-context.xml")
        val dao: CustomerDao = ctx.getBean(classOf[CustomerDao])

        dao.save(new Customer("Paul", "Hildebrand"))
        dao.save(new Customer("Floor", "Hildebrand"))
        dao.save(new Customer("Storm", "Hildebrand"))
        dao.save(new Customer("Jan", "Jansen"))
        dao.save(new Customer("Peter", "Jansen"))

        println(dao.getAll)
        println(dao.getByLastName("Jansen"))
        println(dao.getByLastName("Hildebrand"))

        (1 to 10) foreach (y =>
            dao.find(y) match {
                case Some(x) => println(x)
                case None => println("No customer found with id " + y)
            })
    }

}