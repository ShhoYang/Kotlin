package 集合

import javax.sound.midi.Soundbank

fun main(args: Array<String>) {

    var mutableListOf = mutableListOf(1, 2, 3, 4)
    var readOnlyList: List<Int> = mutableListOf

//    println(mutableListOf)
//    println(readOnlyList)

    // mutableListOf和readOnlyList指向相同的底层list,后者随前者改变
    mutableListOf.add(5)
//    println(readOnlyList)


    // 不可变,使用ArrayList实现的
    var listOf = listOf(null, "9", "7", "8", null)
    var requireNoNulls = listOf.firstOrNull()
    println(requireNoNulls)

    if (listOf.none { it == "9" }) {
        println("no 9")
    } else {
        println("9")
    }

    var list = List(10) {

        index ->
        index * index
    }

//    println(list)

    var list2 = MutableList(10) { index -> index * 2 }

//    println(list2)

    var listOf1 = listOf(1, 2)
    var ofType = listOf1.ofType<Int>()
    println(ofType)


    var listB = arrayOf(B(), B())
    //f(listB)  // Kotlin 禁止我们把一个子类的数组当做超类的数组传递给 Kotlin 的方法,但是集合可以，这正好和java相反

    //
    var listB2 = kotlin.collections.listOf(B())
    f2(listB2)

}

open class A

class B : A()

fun f(listA: Array<A>) {

}

fun f2(listA: List<A>) {

}

inline fun <reified T> List<*>.ofType(): List<T>? {
    if (all { it is T }) {
        return this as List<T>
    }
    return null
}