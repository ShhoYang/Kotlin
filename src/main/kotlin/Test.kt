class Person(var name: String, var age: Int) {
    val b get() = age > 26
}


fun main(args: Array<String>) {
//    println(Person("yang", 25).b)
//
//    println()
//
//    var char: Char? = '2'
//    if (char in '1'..'9') {
//        println(char?.toInt() == 2)
//    } else {
//        println("false")
//    }

    // 指定长度且元素都为null的数组
//    var arr = arrayOfNulls<Int>(5)
//    println(arr.size)
//
//    arr.forEach { println(it == null) }
//
//    var f = {i:Int->(i*i).toString()}
//
//    var arr2 = Array(10,f)
//    arr2.forEach { println(it) }

    var mon = "¥"

    var text = """

        >\t
        |a
        |b\\
        |${mon}9.99
"""
    println(text.trimMargin(">"))


    var s: String? = "999"
    println(s?.toIntOrNull() ?: 0)


    val twoParameters: (String, Int) -> String = { s, i ->
        s.repeat(i)
    }

    val repeat: String.(Int) -> String = twoParameters

    fun runTransformation(f: (String, Int) -> String): String {
        return f("hello", 3)
    }

    val result = runTransformation(repeat) // OK

    println("result = $result")

}

