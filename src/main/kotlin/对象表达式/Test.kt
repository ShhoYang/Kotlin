package 对象表达式

class Test {

    // 私有函数，返回匿名对象类型
    private fun foo() = object {
        val x = "x"
    }

    // 共有函数，返回超类，默认Any
    fun f002() = object {
        val y = "y"
    }

    fun test(){
        var foo = foo()
        println(foo.x)
        var f002 = f002()
        //println(f002.y) 不能访问y
    }
}

fun foo() {
    val a = object {
        val x = 1
        val y = 2
    }

    println(a.x + a.y)
}

fun main(args: Array<String>) {
    foo()
}
