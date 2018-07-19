package 区间

fun main(args: Array<String>) {

    var x = 9


    if(x in 0..9){
//        println(true)
    }

    //不包含9
    for(x in 0 until 9){
//        print("$x\t")
    }

    println()

    //包含9
    for(x in 0..9){
//        print("$x\t")
    }

    println()

    for(x in 0..9 step 2){
//        print("$x\t")
    }

    println()

    //倒序
    for(x in 9 downTo 0 step 2){
//        print("$x\t")
    }

    x = 2
    for(x in (1..9).reversed()){
        println(x)
    }
}