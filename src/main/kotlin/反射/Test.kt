package 反射

import kotlin.reflect.KClass
import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter

open class Person(var name: String) {
    fun getClaName(): String? {
        return this::class.qualifiedName
    }
}

class Me(name: String) : Person(name) {
    val prop = Me::name
}

class Outer{
    inner class Inner
}

class Foo

fun createFoo(factory:()->Foo){
    val s:Foo = factory()
}


fun main(args: Array<String>) {
    val p = Person("yang")
    println(p::class.qualifiedName)
    println(p.getClaName())

    val me = Me("shihao")
    println(me::class.qualifiedName)
    println(me.getClaName())

    val p2 = Me("yangshhao")
    println(p2::class.qualifiedName)
    println(p2.getClaName())

    var listOf = listOf(1, 2, 3)
    println()
    listOf.filter(::isOdd).forEach { println(it) }

    var listStr = listOf("java", "python", "kotlin", "c++")

    val compose = compose(::isOdd, ::length)

    println()
    listStr.filter(compose).forEach { println(it) }

    var listEmpty = listStr.listEmpty(listIsEmpty)
    println()
    println("list is empty: $listEmpty")

    // 属性饮用可以用在不需要参数的函数处
    listStr.map(String::length).forEach { println(it) }

    println()
    //属性引用
    println(::x.get())
    println(::x.name)
    ::x.set(3)
    println(::x.get())

    // 访问属性值
    var prop = me.prop.get(me)
    println()
    println(prop)

    // 扩展属性
    println()
    println(String::laseChar.get("kotlin"))

    // 与java的互操作
    println(Person::name.javaGetter) //java方法
    println(Person::name.javaField) // 幕后字段

    println()
    println(getKClass("s"))

    // 构造函数引用
    val foo = createFoo(::Foo)
    println(foo.toString())

    // 特定对象的实力引用
    val numberRegex = "\\d".toRegex()
    println(numberRegex.matches("3"))
    //绑定的函数引用
    val isNumber = numberRegex::matches
    println(isNumber("3"))
    //绑定属性
    val aLength = "abs"::length
    println(aLength.get())

    val outer = Outer()
    // 内部类的构造函数绑定的可调用引用
    var inner  = outer::Inner
    println(inner.name)
}

var x = 1

fun isOdd(x: Int) = x % 2 != 0

fun isOdd(s: String) = s.length % 2 != 0

fun length(s: String) = s.length

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}

val listIsEmpty: List<*>.() -> Boolean = List<*>::isEmpty

fun List<*>.listEmpty(f: List<*>.() -> Boolean): Boolean {
    return f()
}

// 扩展属性
val String.laseChar: Char get() = this[length - 1]

fun getKClass(any: Any): KClass<Any> = any.javaClass.kotlin


