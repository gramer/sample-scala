object collection {
    println("Welcome to the Scala worksheet")     //> Welcome to the Scala worksheet

    val numbers = List(1, 2, 3, 4)                //> numbers  : List[Int] = List(1, 2, 3, 4)
    Set(1, 1, 2)                                  //> res0: scala.collection.immutable.Set[Int] = Set(1, 2)

    val student = (1, "kkj")                      //> student  : (Int, String) = (1,kkj)
    student._1                                    //> res1: Int = 1

    student match {
        case (id, "kkj") => print("first")
        case (1, "kkj") => print("aa")
        case (id, name) => print("bb")
        case _ => print("99")
    }                                             //> first

    val times = 1                                 //> times  : Int = 1

    times match {
        case 1 => "one"
        case 2 => "two"
        case _ => "some other number"
    }                                             //> res2: String = one

    1 -> 2                                        //> res3: (Int, Int) = (1,2)

    val people = Map(1 -> "kkj", 2 -> "bbk")      //> people  : scala.collection.immutable.Map[Int,String] = Map(1 -> kkj, 2 -> bb
                                                  //| k)
    val result = people.get(3)                    //> result  : Option[String] = None
    result.getOrElse("Guest") + "님"               //> res4: String = Guest��
    List(1, 2, 3, 4).map((i: Int) => i * 2)       //> res5: List[Int] = List(2, 4, 6, 8)

    numbers.foreach((i) => println(i * 2))        //> 2
                                                  //| 4
                                                  //| 6
                                                  //| 8

    numbers.filter((i) => i % 3 == 0)             //> res6: List[Int] = List(3)
    List(List(1, 2), List(3, 4)).flatten          //> res7: List[Int] = List(1, 2, 3, 4)

    numbers.drop(1)                               //> res8: List[Int] = List(2, 3, 4)

    numbers.foldLeft(10) { (m, n) => m + n }      //> res9: Int = 20

    numbers
    	.filter((i) => i % 2 == 0)
    	.foldLeft(0) { (m, n) => m + n }          //> res10: Int = 6
    	
    List(1,2,3,4).map((i => i * 2))               //> res11: List[Int] = List(2, 4, 6, 8)
    
    List(1, 2, 3).zip(List("a", "b", "c"))        //> res12: List[(Int, String)] = List((1,a), (2,b), (3,c))

}