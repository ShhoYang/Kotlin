package 协程

import kotlin.coroutines.experimental.SequenceBuilder
import kotlin.coroutines.experimental.buildSequence

suspend fun SequenceBuilder<Int>.yieldOfOdd(x:Int){
    if(x%2!=0){
        yield(x)
    }
}

fun main(args: Array<String>) {
    val fibonacciSeq = buildSequence {
        var a = 0
        var b = 1
        yield(0)
        while (true) {
            println(Thread.currentThread().name)
            yield(a + b)
            var temp = a + b
            a = b
            b = temp
        }
    }

    println(fibonacciSeq.take(8).toList())

    println()

    val lazySeq = buildSequence {
        println("start")
        for (i in 1..5) {
            yield(i)
            println("step $i")
        }
        println("end")
    }

//    lazySeq.take(1).forEach {
//        println(it)
//    }

    val lazySepAll = buildSequence {
        yield(1)
        yieldAll(1..10)
    }

    //lazySepAll.forEach { println(it) }

    val lazyOddSeq = buildSequence {
        for (i in 1..10){
            yieldOfOdd(i)
        }
    }

    lazyOddSeq.forEach { println(it) }

}