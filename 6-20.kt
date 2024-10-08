fun main() {
    val a = 2
    val c = 3
    val g = 10
    val h = IntArray(g) { a + it * c }
    println("Арифметическая прогрессия:")
    println(h.contentToString())
}