package 类

class Child() : Person("name") {

    override var count: Int = super.count + 2

    var address = "address"
        get() {
            return "address"
        }

        set(value) {
            if (value != null) {
                //使用幕后字段
                field = value
            }
        }

    constructor(name: String, age: Int, address: String) : this() {

    }

    override fun eat() {
        super.eat()
        println("eat meat")
    }

    inner class Foo() {
        fun f() {


            //super@Child.eat() // 调用超类的方法
            eat()   //调用派生类的方法
        }
    }
}