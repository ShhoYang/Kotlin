package map


fun main(vararg args: String) {
    args.flatMap { it.split("_") }.map(::println)

    var map :MutableMap<String, Int> = mutableMapOf("one" to 1,"two" to 2)
    var one :Int by map
    var two :Int by map

    println("one = $one")
    println("two = $two")

//    var map2 = map- "one"
//    var map2 = map- listOf("one","two")
//    println(map2)



    var defaultValueMap = map.withDefault { key -> key.length }
    //map.getValue() 会报异常
    var value = defaultValueMap.getValue("one1")
    println(value)


}