fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val b = mutableListOf<Int>()
    val c = mutableListOf<Int>()

    for (number in a) {
        if (number % 2 == 0) {
            b.add(number)
        } else {
            c.add(number)
        }
    }

    println("Четные числа: $b")
    println("Нечетные числа: $c")
}