import kotlin.random.Random
fun main() {
    val a = IntArray(20) { Random.nextInt(1, 101) }
    println("Массив из 20 случайных чисел от 1 до 100:")
    println(a.contentToString())
}