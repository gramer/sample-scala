object basic2 {
    println("Welcome to the Scala worksheet")     //> Welcome to the Scala worksheet
    class Foo {}
    object FooMaker {
        def apply() = new Foo
    }
    val newFoo = FooMaker()                       //> newFoo  : basic2.Foo = basic2$$anonfun$main$1$Foo$1@5a5e179a
    class Bar {
        def apply() = 1
    }

    val bar = new Bar                             //> bar  : basic2.Bar = basic2$$anonfun$main$1$Bar$1@4a8c1dd9
    bar()                                         //> res0: Int = 1

    object addOne extends Function1[Int, Int] {
        def apply(m: Int): Int = m + 1
    }

    addOne(1)                                     //> res1: Int = 2

    case class Calculator(brand: String, model: String)
    val hp20b = Calculator("hp", "20b")           //> hp20b  : basic2.Calculator = Calculator(hp,20b)

    class AddOne extends (Int => Int) {
        def apply(m: Int): Int = m + 1
    }

    val add = new AddOne                          //> add  : basic2.AddOne = <function1>
    val times = 1                                 //> times  : Int = 1

    times match {
        case 1 => "one"
        case 2 => "two"
        case _ => "some other number"
    }                                             //> res2: String = one

    def bigger(o: Any): Any = {
        o match {
            case i: Int if i < 0 => i - 1
            case i: Int => i + 1
            case d: Double if d < 0.0 => d - 0.1
            case d: Double => d + 0.1
            case text: String => text + "s"
        }
    }                                             //> bigger: (o: Any)Any
    
    bigger(3)                                     //> res3: Any = 4
    bigger("aa")                                  //> res4: Any = aas
    bigger(0.03)                                  //> res5: Any = 0.13

}