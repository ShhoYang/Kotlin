package 枚举


inline fun <reified T:Enum<T>> printAllValue(){
    println(enumValues<T>().joinToString { it.name })

    println(enumValueOf<Week>("星期一"))
}

fun main(args: Array<String>) {
    printAllValue<Week>()

    println(Week.星期一.ordinal)
    println(Week.星期一.name)


    var values = Week.values()
    values.forEach { println(it) }

    var valueOf = Week.valueOf("星期一")
    println(valueOf)

}

