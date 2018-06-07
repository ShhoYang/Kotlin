
class Person(var name:String,var age:Int){
    val b get() = age>26
}

fun main(args: Array<String>) {
    println(Person("yang",25).b)
}