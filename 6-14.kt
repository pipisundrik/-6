fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    println("Числа, делящиеся на 3:")
    for (d in a) {
        if (d % 3 == 0) {
            print("$d ")
        }
    }
    println()
}