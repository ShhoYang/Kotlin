package 委托

/**
 * 委托
 */
interface Base {

    val message: String

    fun print()
}

class BaseImpl(var s: Int) : Base {
    override val message: String = "BaseImpl"

    override fun print() {
        println("BaseImpl:message = $message, s = $s")
    }
}

/**
 *  复写的是实现，并非委托对象的方法
 */
class Derived(b: Base) : Base by b {

    override val message: String = "Derived"

    override fun print() {
        println("Derived:message = $message")
    }
}

fun main(args: Array<String>) {
    args.filter { it != "3" }.forEach { println(it) }
    val b = BaseImpl(2)
    val derived = Derived(b)

    // b只能访问自身内部的成员，并不是derived的实现
    println(b.message)
    b.print()

    println(derived.message)
    derived.print()
}