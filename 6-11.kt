fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5)
    val b = intArrayOf(3, 5, 7, 9, 11)

    val c = a.intersect(b.toSet()).toTypedArray()

    println("Пересечение массивов: ${c.contentToString()}")
}