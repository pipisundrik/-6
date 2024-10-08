fun linearSearch(array: IntArray, target: Int): Boolean {
    for (element in array) {
        if (element == target) {
            return true
        }
    }
    return false
}
fun main() {
    val a = intArrayOf(1, 10, 3, 6, 9, 21)
    val d = 7
    if (linearSearch(a, d)) {
        println("Элемент $d найден в массиве")
    } else {
        println("Элемент $d не найден в массиве")
    }
}