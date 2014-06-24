object basic2 {
    println("Welcome to the Scala worksheet")     //> Welcome to the Scala worksheet
    class Foo {}
    object FooMaker {
        def apply() = new Foo
    }
    val newFoo = FooMaker()                       //> newFoo  : basic2.Foo = basic2$$anonfun$main$1$Foo$1@4a8c1dd9
    class Bar {
        def apply() = 1
    }

    val bar = new Bar                             //> bar  : basic2.Bar = basic2$$anonfun$main$1$Bar$1@79df8b99
    bar()                                         //> res0: Int = 1

    object addOne extends Function1[Int, Int] {
        def apply(m: Int): Int = m + 1
    }

    addOne(1)                                     //> res1: Int = 2

    case class Calculator(brand: String, model: String)
    val hp20b = Calculator("hp", "20b")           //> hp20b  : basic2.Calculator = Calculator(hp,20b)

}