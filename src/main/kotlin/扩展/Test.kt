package 扩展

class Test{
    companion object {

    }
}

fun Test.Companion.foo(){
    println("foo")
}

fun main(args: Array<String>) {
    Test.foo()
}