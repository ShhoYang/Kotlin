package 类


fun main(args: Array<String>) {
    var person = Person("yangshihao", 25)

    var child = Child()
    child.eat()
    println(child.address)
    println(child.count)
    child.count = 29
    println(child.count)

    println()

    var foo = Child().Foo()
    foo.f()

    var c = C()
    c.f()

    var g = G()
    //println("g = ${g.x}")
}