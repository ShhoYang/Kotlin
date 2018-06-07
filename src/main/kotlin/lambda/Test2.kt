package lambda

data class Result(val value: Int, val status: String)

fun getResult() = Result(20, "ok").also { println("value = ${it.value} --> status = ${it.status}") }

fun main(args: Array<String>) {

    var (value, _) = getResult()
    println("value is $value")
}