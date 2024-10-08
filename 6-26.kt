fun main() {
    val a = intArrayOf(1, 7, 31, 5, 9)
    var sum = 0
    for (number in a) {
        sum += number
    }
    val d = sum.toDouble() / a.size
    println("Среднее арифметическое: $d")
}