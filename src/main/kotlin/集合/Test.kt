package 集合

fun main(args: Array<String>) {
    var list = List(10){
        index -> index * index
    }

    println(list)

    var list2 = MutableList(10){index -> index*2 }

    println(list2)
}