object basic1 {
    println("Welcome to the Scala worksheet")     //> Welcome to the Scala worksheet
    1 + 1                                         //> res0: Int(2) = 2
    var name = "kkj"                              //> name  : String = kkj
    def addOne(n: Int): Int = n + 1               //> addOne: (n: Int)Int
    addOne(3)                                     //> res1: Int = 4
    def three() = 1 + 2                           //> three: ()Int
    three                                         //> res2: Int = 3
    (x: Int) => x + 1                             //> res3: Int => Int = <function1>
    val addTwo = (x: Int) => x + 2                //> addTwo  : Int => Int = <function1>
    addTwo(20)                                    //> res4: Int = 22
    def timesTwo(n: Int): Int = {
        println("hello world")
        n * 2
    }                                             //> timesTwo: (n: Int)Int
    timesTwo(3)                                   //> hello world
                                                  //| res5: Int = 6
    (i: Int) => {
        println("hello world")
        i * 2
    }                                             //> res6: Int => Int = <function1>

    1 * 7                                         //> res7: Int(7) = 7

}