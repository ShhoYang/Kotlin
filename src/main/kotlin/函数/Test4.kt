package 函数

class HTML {
    fun body() {

    }
}

fun html(init: HTML.() -> Unit): HTML {
    var html = HTML() // 创建接收者对象
    println(html.toString())
    html.init() // 将接收者对象传递给lambda
    return html
}

fun main(args: Array<String>) {

    // 带接收者的lambda表达式
    var html = html{ body() }
    println(html.toString())
}