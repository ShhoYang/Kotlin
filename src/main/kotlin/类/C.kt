package 类

class C : A(), B {

    override fun f() {
        super<A>.f()    //调用父类A的f()
        super<B>.f()    //调用父类B的f()
    }
}