package lambda

fun main(args: Array<String>) {
    //纯数字
    var regex = "\\d+".toRegex()
    listOf("10", "20", "3a").filter(regex::matches).forEach(::println)


    var map = mapOf(1 to "one", 2 to "two")
    //之前
    println(map.mapValues { entry ->
        var (key, value) = entry
        "$key -> $value"
    })

    //之后
    println(map.mapValues { (key, value) -> "$key --> $value" })

    //下划线用于未使用的参数
    map.forEach { _, value -> println(value)  }

}