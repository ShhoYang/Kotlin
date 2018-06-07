package 密封类


sealed class Expr

data class Const(val e: Double) : Expr()

data class Sum(val e1: Expr, val e2: Expr) : Expr()

object NotANumber : Expr()

fun eval(expr: Expr): Double = when (expr) {
    is Const -> expr.e
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
}

var result = eval(Sum(Const(1.2), Const(2.3)))

fun main(args: Array<String>) {
    println("result = $result")
}

