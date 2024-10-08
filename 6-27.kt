fun findLongestSequence(array: IntArray): IntArray {
    if (array.isEmpty()) {
        return IntArray(0)
    }
    var a = 1
    var s = 1
    var start = 0
    var h = 0
    for (i in 1 until array.size) {
        if (array[i] == array[i - 1]) {
            s++
        } else {
            if (s > a) {
                a = s
                start = h
            }
            s = 1
            h = i
        }
    }
    if (s > a) {
        a = s
        start = h
    }
    return array.sliceArray(start until start + a)
}
fun main() {
    val u = intArrayOf(1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4)
    val i = findLongestSequence(u)
    println("Максимальная последовательность: ${i.contentToString()}")
}