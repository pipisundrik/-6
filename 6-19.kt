fun mergeSortedArrays(arr1: IntArray, arr2: IntArray): IntArray {
    val mergedArray = IntArray(arr1.size + arr2.size)
    var i = 0
    var j = 0
    var k = 0
    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] < arr2[j]) {
            mergedArray[k++] = arr1[i++]
        } else {
            mergedArray[k++] = arr2[j++]
        }
    }
    while (i < arr1.size) {
        mergedArray[k++] = arr1[i++]
    }
    while (j < arr2.size) {
        mergedArray[k++] = arr2[j++]
    }
    return mergedArray
}
fun main() {
    val a = intArrayOf(1, 3, 5, 7, 9)
    val b = intArrayOf(2, 4, 6, 8, 10)
    val mergedArray = mergeSortedArrays(a, b)
    println("Слияние массивов: ${mergedArray.contentToString()}")
}