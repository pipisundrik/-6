fun findSecondLargest(array: IntArray): Int {
    if (array.size < 2) {
        throw IllegalArgumentException("Массив должен содержать хотя бы 2 элемента")
    }
    var a = Int.MIN_VALUE
    var d = Int.MIN_VALUE
    for (number in array) {
        if (number > a) {
            d = a
            a = number
        } else if (number > d && number != a) {
            d = number
        }
    }
    if (d == Int.MIN_VALUE) {
        throw IllegalArgumentException("Все элементы массива одинаковы")
    }
    return d
}
fun main() {
    val f = intArrayOf(5, 2, 8, 1, 9, 3, 7, 4, 6)
    try {
        val n = findSecondLargest(f)
        println("Второй по величине элемент: $n")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}