fun removeElement(array: IntArray, element: Int): IntArray {
    val a = IntArray(array.size - 1)
    var j = 0
    for (i in array.indices) {
        if (array[i] != element) {
            a[j++] = array[i]
        }
    }
    return a
}
fun main() {
    val v = intArrayOf(1, 2, 3, 4, 5, 2, 6, 2, 7)
    val t = 2
    val d = removeElement(v, t)
    println("Исходный массив: ${v.contentToString()}")
    println("Массив после удаления элемента $t: ${d.contentToString()}")
}