fun main() {
    val a = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    println("Исходная матрица:")
    printMatrix(a)
    val s = transpose(a)
    println("Транспонированная матрица:")
    printMatrix(s)
}
fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    val d = matrix.size
    val f = matrix[0].size
    val g = Array(f) { IntArray(d) }
    for (i in 0 until d) {
        for (j in 0 until f) {
            g[j][i] = matrix[i][j]
        }
    }
    return g
}
fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        println(row.contentToString())
    }
    println()
}