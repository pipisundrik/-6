fun main() {
    val a = intArrayOf(1, 24, 3, 5, 11, 6, 7, 8, 99, 10)
    var sum = 0
    for (number in a) {
        if (number % 2 == 0) {
            sum += number
        }
    }
    println("Сумма четных чисел: $sum")
}