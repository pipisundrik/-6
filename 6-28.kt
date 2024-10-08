fun main() {
    println("Введите количество элементов в массиве:")
    val a = readLine()!!.toInt()
    println("Введите элементы массива через пробел:")
    val s = readLine()!!.split(" ")
    val f = IntArray(a) { s[it].toInt() }
    println("Введенный массив:")
    println(f.contentToString())
}