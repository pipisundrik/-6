fun swapElements(array: IntArray, index1: Int, index2: Int) {
    if (index1 in array.indices && index2 in array.indices) {
        val a = array[index1]
        array[index1] = array[index2]
        array[index2] = a
    } else {
        println("Неверные индексы")
    }
}

fun main() {
    val d = intArrayOf(1, 2, 3, 4, 5)
    println("Исходный массив: ${d.contentToString()}")

    swapElements(d, 1, 3)

    println("Массив после перестановки: ${d.contentToString()}")
}