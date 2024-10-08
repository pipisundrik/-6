fun isPalindrome(array: IntArray): Boolean {
    val a = array.reversedArray()
    return array.contentEquals(a)
}
fun main() {
    val d = intArrayOf(1, 2, 3, 2, 1)
    val c = intArrayOf(1, 2, 3, 4, 5)
    println("Массив ${d.contentToString()} является палиндромом: ${isPalindrome(d)}")
    println("Массив ${c.contentToString()} является палиндромом: ${isPalindrome(c)}")
}