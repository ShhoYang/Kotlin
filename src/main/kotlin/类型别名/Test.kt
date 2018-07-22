package 类型别名

typealias MyType = Map<String, Int>

fun createData(): MyType =
        mapOf("A" to 24,
                "B" to 23,
                "C" to 22,
                "D" to 24)

fun count(myType: MyType) = myType.count { it.value == 24 }

fun check(myType: Map<String, Int>) = myType["A"] == 24

typealias Predicate<T> = (T) -> Boolean

fun max(p: Predicate<Int>): Boolean {
    return p(10)
}

fun main(args: Array<String>) {
    var d = createData()
    println("24岁的人有${count(d)}个")

    println("A不是24岁:${check(d)}")

    println()

    var f: (Int) -> Boolean = {
        it > 10
    }
    println(max(f))

    val p: Predicate<Int> = { it > 10 }
    println(max(p))


}