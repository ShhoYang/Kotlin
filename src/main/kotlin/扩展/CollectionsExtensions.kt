package com.hao.kt2.extensions

fun <K, V : Any> Map<K, V?>.toVarargArray(): Array<out Pair<K, V>> =
        map({ Pair(it.key, it.value!!) }).toTypedArray()

inline fun <T, R : Any> Iterable<T>.firstResult(predicate: (T) -> R?): R {
    for (element in this) {
        val result = predicate(element)
        if (result != null) {
            return result
        }
    }

    throw NoSuchElementException("No element matching predicate was found")
}

fun main(args: Array<String>) {
//    var map = mapOf("1" to "one", "2" to "two")
//    val array = map.toVarargArray()
//    // array.iterator().forEach { println(it is Pair) }
//    lateinit var third: Node<Int>
//    var second = Node(2, { third })
//    var first = Node(1, { second })
//    third = Node(3, { first })
//
//    var nodes = generateSequence(first) { it.next() }
//
//    var s: String = nodes.take(8).joinToString { it.value.toString() }
//
//    println(s)

    var node: Node<String>? = null
    node.print()
    node.name = "2"
    println(node.name)
}

class Node<T>(val value: T, val next: () -> Node<T>)

fun Node<String>?.print() {
    println("node")
}

var Node<String>?.name:String
    set(value) {

    }
    get() {
        return ""
    }
