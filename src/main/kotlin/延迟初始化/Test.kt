package 延迟初始化

fun main(args: Array<String>) {
    Foo().isInitialized()
}


class Foo {
    private lateinit var s: String

    fun isInitialized() {
        println(this::s.isInitialized)

        s = "value"

        println(::s.isInitialized)
    }
}