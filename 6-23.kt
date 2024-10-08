fun combineArrays(vararg arrays: IntArray): IntArray {
    val a = IntArray(arrays.sumOf { it.size })
    var w = 0
    for (array in arrays) {
        for (element in array) {
            a[w++] = element
        }
    }
    return a
}
fun main() {
    val e = intArrayOf(1, 2, 3)
    val r = intArrayOf(4, 5, 6)
    val y = intArrayOf(7, 8, 9)
    val combinedArray = combineArrays(e, r, y)
    println("Объединенный массив: ${combinedArray.contentToString()}")
}