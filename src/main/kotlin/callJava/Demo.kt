package callJava

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool
import java.util.ArrayList
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.ThreadPoolExecutor

//kotlin的类最多只能继承一个java类或者接口
//class Example:Person(),Student(){
//
//}

/**
 * 操作java集合
 */
fun foo(listInt: List<Int>) {

    // java集合
    var list = ArrayList<Int>()

    for (i in listInt) {
        list.add(i)
    }

    for (i in 0..list.size - 1) {
        print("${list[i]}, ")
        list[i] = list[i] * 2
    }
    println()

    for (i in list.indices) {
        print("${list[i]}, ")
    }
    println()
}

/**
 * 调用java的get/set
 */
fun foo1() {
    var person = Person()
    person.name = "yangshihao"
    person.age = 26
    person.isMarry = false
    println("name:${person.name}, age:${person.age}, marry:${person.isMarry}")
    //操作符重载
    -person
    println("name:${person.name}, age:${person.age}, marry:${person.isMarry}")

    var say = person.sayHello()
    // Unit
    println("say:$say")
    // 关键字转义，is在Kotlin中是关键字
    person.`is`()

    // int[] -> IntArray
    var listNums: IntArray = person.nums

    var intArrayOf = intArrayOf(1, 2, 3)
    // 可变参数，用*传递数组
    person.money(*intArrayOf, 4, 5)

    // kotlin的Any没有wait(),notify()等方法
    //(person as java.lang.Object).wait()

    // 反射
    var java = person::class.java
    var java2 = person.javaClass
    println("反射:$java")
}

fun foo2() {
    var list = ArrayList<String>()
    list.add("item")
    // 操作Java赋给的值时默认不会为null，并且自动推断类型
    var size = list.size
    var string = list[0]
    var saveString: String? = list[0] //更安全
    var length = string.length

    var strings: Array<String> = arrayOf("1", "2")
    //var anys: Array<Any> = strings // Kotlin数组是不型变的,但是在Java中可以
}

/**
 * 对数组的操作没有过多的开销
 */
fun foo3() {
    var arr = arrayOf(1, 2, 3)
    arr[2] = arr[1] * 5 // 不会实际生成对 get() 和 set() 的调用
    // 另种遍历都不创建迭代器
    for (i in arr.indices) {
        print("${arr[i]}, ")
    }
    println()
    for (i in arr) {
        print("$i, ")
    }
}

/**
 * SAM(single abstract method)转换
 */
fun foo4() {
    var runnable = Runnable { println("This runs in a runnable") }
    val threadPool = Executors.newCachedThreadPool()
    threadPool.execute { println("this runs in a thread pool") }
}

fun main(args: Array<String>) {
    foo(listOf(1, 2, 3))
    foo1()
    foo2()
    foo3()
}