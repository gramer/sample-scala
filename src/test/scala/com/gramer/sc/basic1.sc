import java.util._

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
    def multiply(m: Int)(n: Int): Int = m * n     //> multiply: (m: Int)(n: Int)Int
    multiply(2)(3)                                //> res8: Int = 6
    val timesTwo2 = multiply(2)_                  //> timesTwo2  : Int => Int = <function1>
    timesTwo2(3)                                  //> res9: Int = 6

    def capitalizeAll(args: String*) = {
        args.map { arg =>
            arg.capitalize
        }
    }                                             //> capitalizeAll: (args: String*)Seq[String]

    capitalizeAll("rarity", "applejack")          //> res10: Seq[String] = ArrayBuffer(Rarity, Applejack)

    class Calculator(brand: String) {
        val color: String = if (brand == "TI") {
            "red"
        } else if (brand == "HP") {
            "black"
        } else {
            "white"
        }

        def add(m: Int, n: Int): Int = m + n
    }

    val calc = new Calculator("HP")               //> calc  : basic1.Calculator = basic1$$anonfun$main$1$Calculator$1@36ff057f

    calc.add(1, 2)                                //> res11: Int = 3
    calc.color                                    //> res12: String = black

    class C {
        var acc = 0
        def minc = { acc += 1 }
        val finc = { () => acc += 1 }
    }

    val c = new C                                 //> c  : basic1.C = basic1$$anonfun$main$1$C$1@2d342ba4
    c.minc
    c.finc                                        //> res13: () => Unit = <function0>

    trait Car {
        var brand: String
    }

    trait Shiny {
        var shineRefraction: Int
    }

    class BMW extends Car with Shiny {
        var brand: String = "aa"
        var shineRefraction: Int = 3
    }

    trait Cache[K, V] {
        def get(key: K): V
        def put(key: K, value: V)
        def delete(key: K)
    }

    def remove[K](key: K): Unit = { println(key) }//> remove: [K](key: K)Unit

    class Test[K] {
        type List = ArrayList[K]
    }

}