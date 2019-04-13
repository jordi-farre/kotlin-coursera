package week2.playground

fun List<Int>.sum(): Int = this.reduce { total, current -> current + total }

fun main(args: Array<String>) {
    val sum = listOf(1, 2, 3).sum()
    println(sum)    // 6
}