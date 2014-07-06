object type1 {
    def foo(a: Int): Int = a * 2                  //> foo: (a: Int)Int

    def id[T](x: T) = x                           //> id: [T](x: T)T
    val x = id(322)                               //> x  : Int = 322

    class Contravariant[-A]

    val cv: Contravariant[String] = new Contravariant[AnyRef]
                                                  //> cv  : type1.Contravariant[String] = type1$$anonfun$main$1$Contravariant$1@6d
                                                  //| 62dbb6

    class Animal { val sound = "rustle" }
    class Bird extends Animal { override val sound = "call" }
    class Chicken extends Bird { override val sound = "cluck" }

    val getTweet: (Bird => String) = ((a: Animal) => a.sound)
                                                  //> getTweet  : type1.Bird => String = <function1>

    val hatch: (() => Bird) = (() => new Chicken) //> hatch  : () => type1.Bird = <function0>

    def biophony[T <: Animal](things: Seq[T]) = things map (_.sound)
                                                  //> biophony: [T <: type1.Animal](things: Seq[T])Seq[String]
    
    biophony(Seq(new Chicken, new Bird))          //> res0: Seq[String] = List(cluck, call)

    List(1, 2, 3, 4) map (i => i * 2)             //> res1: List[Int] = List(2, 4, 6, 8)
 
 		class Number {
 			def addOne(i:Int):Int = i + 1
 		}
    
    new Number() addOne 1                         //> res2: Int = 2
    
    val flock = List(new Bird, new Bird)          //> flock  : List[type1.Bird] = List(type1$$anonfun$main$1$Bird$1@630045eb, type
                                                  //| 1$$anonfun$main$1$Bird$1@26ee7a14)
    new Animal :: flock                           //> res3: List[type1.Animal] = List(type1$$anonfun$main$1$Animal$1@7290cb03, typ
                                                  //| e1$$anonfun$main$1$Bird$1@630045eb, type1$$anonfun$main$1$Bird$1@26ee7a14)
    
    
}