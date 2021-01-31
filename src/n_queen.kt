fun main(args: Array<String>) {
    val N = readLine()!!.toInt()

    val board = IntArray(N) { 0 }
    var trobada = nQueen(board, 0)
    if (!trobada) println("Not possible")
}

fun nQueen(board: IntArray, row: Int): Boolean {
    if (row == board.size) {
        show(board)
        return true
    } else for (column in 0 until board.size) {
        if (isSafe(board, row, column)) {
            board[row] = column
            if (nQueen(board, row + 1))
                return true
        }
    }
    return false
}

fun isSafe(board: IntArray, row: Int, column: Int): Boolean {
    for (i in row - 1 downTo 0) {
        if (board[i] == column || board[i] == column - (row - i) || board[i] == column + (row - i))
            return false
    }
    return true
}


fun show(board: IntArray) {
    println("YES")
    for (i in 0 until board.size) {
        for (j in 0 until board.size) {
            if (j == board[i])
                print("1")
            else
                print("0")
            if (j < board.size)
                print(" ")
        }
        println()
    }
}
