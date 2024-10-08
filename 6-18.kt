fun main() {
    val a = intArrayOf(1, 5, 8, 4, 5, 11, 7, 22, 9, 10, 178, 13, 12, 14, 15)

    for (i in 0 until a.size step 5) {
        val f = a.sliceArray(i until minOf(i + 5, a.size))
        println("Группа ${i / 5 + 1}: ${f.contentToString()}")
    }
}