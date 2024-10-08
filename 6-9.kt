fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5)
    val d = IntArray(a.size)
    for (i in a.indices) {
        d[i] = a[i]
    }
    val g = a.copyOf()
    println("Оригинальный массив: ${a.contentToString()}")
    println("Новый массив 1 способ: ${d.contentToString()}")
    println("Новый массив 2 способ: ${g.contentToString()}")
}