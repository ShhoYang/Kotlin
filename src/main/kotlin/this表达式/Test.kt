package this表达式

class A {
    inner class B {
        fun Int.foo() {
            val a = this@A
            val b = this@B
            val c = this

            val  d = this@foo

            println("a = $a") // A
            println("b = $b") // B
            println("c = $c") // foo的接收者Int
            println("d = $d") // foo的接收者Int
        }

        val foo2 =lambda@ fun String.(){
            1.foo()
            val e = this // foo2的接收者String
            val f = this@lambda // // foo2的接收者String

            println("e = $e")
            println("f = $f")
        }

        val foo3 ={
            "q".foo2()
            val g = this // 没有接收者,A
            println("g = $g")
        }
    }
}

fun main(args: Array<String>) {

    val b =A().B()
    b.foo3()
}