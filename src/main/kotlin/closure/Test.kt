package closure

/**
 * 闭包
 */
fun test():()->Unit{
    var i = 3
    return fun(){
        i++
        println(i)
    }
}

fun main(args: Array<String>) {
    var t = test()
    t()
    t()
    t()
}