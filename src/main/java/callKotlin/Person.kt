@file:JvmName("kt")

// 修改生成类的类名

package callKotlin

class  Person @JvmOverloads constructor(var name: String, private var address: String, var age: Int = 26, var marry: Boolean) {

    companion object {
        @JvmStatic
        fun sayHello(){
            println("hello")
        }

        fun eat(){

        }
    }

    // 属性用JvmField注解,使其成为与属性有相同的可见性的静态字段
    @JvmField
    val ID = "410"

    // 属性用lateinitxiu,使其成为与属性的setter有相同的可见性的静态幕后字段
    lateinit var school: String
}

// 用const标示，会生成静态字段
const val PHONE = "151"

fun packageFoo(): String {
    return "this is package fun"
}

/**
 * kotlin没有受检异常,所以在Java中不用捕获这个异常,但是报错还是会crash,为了解决这个问题,kotlin方法用@Throws注解
 */
@Throws(NullPointerException::class)
fun fooThrow(){
    throw NullPointerException()
}