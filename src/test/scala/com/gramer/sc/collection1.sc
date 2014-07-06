object collection1 {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                                                  //> numbers  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    1 :: 2 :: 3 :: 4 :: Nil                       //> res0: List[Int] = List(1, 2, 3, 4)

    for (i <- 1 to 3) {
        println(i)                                //> 1
                                                  //| 2
                                                  //| 3
    }

    (1 to 3).map { i => i }                       //> res1: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 3)
    

}