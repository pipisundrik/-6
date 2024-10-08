import kotlin.random.Random

fun main() {
    val a = Array(100) { Random.nextInt(1, 101) }
    println("Массив: ${a.joinToString(", ")}")
    val s = Array(10) { IntArray(10) } // Массив из 10 групп
    for (i in 0..99) {
        val g = i / 10
        val h = i % 10
        s[g][h] = a[i]
    }
    println("\nГруппы:")
    for (i in 0..9) {
        println("Группа ${i + 1}: ${s[i].joinToString(", ")}")
    }
}