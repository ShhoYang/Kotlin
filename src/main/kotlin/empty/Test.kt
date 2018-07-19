package empty

import java.io.DataOutput
import java.io.File

 class Person{
     fun say(){
         println("hello")
     }
 }

fun main(args: Array<String>) {

    var files = File("test").listFiles()

    //if not null
    println(files?.size)

    //if not null and else
    println(files?.size?:"0")

    //if null
    println(files?:"empty")

    var list = listOf("Java", "Kotlin")
    //var list = listOf<String>()
    println(list?.size)
    println(list.firstOrNull()?:"null")

//    var p:Person? = null
    var p:Person? = Person()
    p?.say()


    var listOfEmpty = listOf("A","B",null,"D")
    for (s in listOfEmpty) {
        print(s)
    }

    println()

    //过滤掉null
    var filterNotNull = listOfEmpty.filterNotNull()

    for (s in filterNotNull) {
        print(s)
    }

    fun fail(message:String):Nothing{
        throw NullPointerException("NullPointerException")
    }

//    val s =p?.toString()?: fail("test")
//    println(s)

    println()

    val x = null
    val nullList = mutableListOf(x)

//    println(nullList[0] == null)
}