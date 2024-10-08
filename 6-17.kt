fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    var sum = 0
    var product = 1

    for (number in numbers) {
        sum += number
        product *= number
    }

    println("Сумма элементов массива: $sum")
    println("Произведение элементов массива: $product")
}