fun findMedian(array: IntArray): Double {
    val a = array.sortedArray()
    val s = a.size / 2

    return if (a.size % 2 == 0) {
        (a[s - 1] + a[s]).toDouble() / 2
    } else {
        a[s].toDouble()
    }
}

fun main() {
    val f = intArrayOf(1, 5, 3, 7, 9, 2, 4, 6, 8)

    val median = findMedian(f)
    println("Медиана: $median")
}