package 枚举


inline fun <reified T:Enum<T>> printAllValue(){
    println(enumValues<T>().joinToString { it.name })
}

fun main(args: Array<String>) {
    val message = Week.星期一.ordinal
    println(message)


    printAllValue<Week>()
}

