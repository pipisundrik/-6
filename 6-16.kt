fun main() {
    val a = intArrayOf(1, 5, 4)
    val d = intArrayOf(7, 8, 6)
    val f = a + d
    val g = IntArray(a.size + d.size)
    for (i in 0 until a.size) {
        g[i] = a[i]
    }
    for (i in 0 until d.size) {
        g[i + a.size] = d[i]
    }
    println("Массив 1: ${a.contentToString()}")
    println("Массив 2: ${d.contentToString()}")
    println("Объединенный массив 1 способ: ${f.contentToString()}")
    println("Объединенный массив 2 способ: ${g.contentToString()}")
}