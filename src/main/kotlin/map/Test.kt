package map

fun main(vararg args: String) {
    args.flatMap { it.split("_") }.map(::println)
}