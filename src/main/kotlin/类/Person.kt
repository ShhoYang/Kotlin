package 类

open class Person  constructor(name: String) {

   open val count:Int get() = 25

    var first = "first ${name.toUpperCase()}".also(::println)

    init {
        println("first ...")
    }

    var second = "second ${name.length}".also(::println)

    init {
        println("second ...")
    }

    /**
     * 初始化代码块优先于次级构造函数执行
     */
    constructor(name: String, age: Int) : this(name) {
        println("$name $age 岁")
    }

    fun say() {
        println("hello")
    }


    open fun eat() {
        println("eat noodle")
    }
}