package empty

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

    //var list = listOf("Java", "Kotlin")
    var list = listOf<String>()
    println(list?.size)
    println(list.firstOrNull()?:"null")

    //var p:Person? = null
    var p:Person? = Person()
    p?.say()

}

