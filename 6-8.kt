fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val d = 5

    val b = a.indexOf(d)

    if (b != -1) {
        println("Элемент $d найден под индексом $b")
    } else {
        println("Элемент $d не найден в массиве")
    }
}