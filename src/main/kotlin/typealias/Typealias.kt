package `typealias`

/**
 * 自定义类型
 */
typealias MyType = Map<String, Int>

fun createData(): MyType =
        mapOf("楊世豪" to 24,
                "欧阳敏" to 23,
                "党贝" to 22,
                "邹威" to 24)

fun count(myType: MyType) = myType.count { it.value == 24 }

fun check(myType: Map<String, Int>) = myType["楊世豪"] == 25

fun main(args: Array<String>) {
    var d = createData()
    println("24岁的人有${count(d)}个")

    println("楊世豪是不是24岁:${check(d)}")
}