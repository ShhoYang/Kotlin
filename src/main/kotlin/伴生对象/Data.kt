package 伴生对象

class Data {

    // 伴生对象可以省略名字,默认名字Companion
    // 伴生对象很像java的静态成员，实际是真是对象的实例成员，也可以实现接口
    companion object {
        val data = Data()
        fun create(): Data {
            return Data()
        }
    }

    val s = "s"
}