fun main() {
    val n = readLine()!!.toInt()
    var ar = arrayOf<Array<Int>>()
    for (i in 0 until n) {
        var array = arrayOf<Int>()
        for (j in 0 until n) {
            array += 0
        }
        ar += array
    }
    if (solve(0,n,ar)) print1(ar, n)
    else println("Not Possible")
}

fun print1(ar: Array<Array<Int>>, n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n) {
            print("${ar[i][j]} ")
        }
        println()
    }
}

fun solve(row: Int,n: Int,ar: Array<Array<Int>>): Boolean {
    if (row>=n) return true
    for (i in 0 until n){
        if (isSafe(row,i,ar,n)){
            ar[row][i]=1
            if (solve(row+1,n,ar)) return true
            ar[row][i]=0
        }
    }
    return false
}

fun isSafe(row: Int, col: Int,ar:Array<Array<Int>>,n: Int): Boolean {
    for (i in 0 until row){
        if(ar[i][col]==1) return false
    }
    var i = row
    var j = col
    while (i>=0  && j<n){
        if (ar[i][1]==1) return false
        i--
        j++
    }
    while (i>=0  && j>=0){
        if (ar[i][1]==1) return false
        i--
        j--
    }
    return true
}

//fun main(args: Array<String>) {
//    val N = readLine()!!.toInt()
//    val board = IntArray(N) { 0 }
//    var result = nQueen(board, 0)
//    if (!result) println("Not possible")
//}
//
//fun nQueen(board: IntArray, col: Int) : Boolean {
//    if ( col == board.size ) {
//        print(board)
//        return true
//    }
//    else for ( row in board.indices) {
//        if ( isSafe(board, col, row) ) {
//            board[col] = row
//            if ( nQueen(board, col + 1) )
//                return true
//        }
//    }
//    return false
//}
//
//fun isSafe(board: IntArray, col: Int, row: Int): Boolean {
//    for ( i in col - 1 downTo 0 ) {
//        if ( board[i] == row )
//            return false
//        if (board[i] == row - (col - i ) )
//            return false
//        if (board[i] == row + ( col - i) )
//            return false
//    }
//    return true
//}
//
//
//fun print(board: IntArray) {
//    for (element in board) {
//        for (j in board.indices) {
//            if (j == element)
//                print("1")
//            else
//                print("0")
//            if ( j < board.size )
//                print(" ")
//        }
//        println()
//    }
//}


//    var a  = readLine()!!.toInt()
//    var n = readLine()!!.trimEnd().split(" ").map{it.toLong()}.toTypedArray().sorted()
//    val mean = n.sum()/a.toFloat()
//    val median = (n[a/2]+n[a/2-1])/2.0
//    val size = 0
//    val mode  = n.groupBy { it.absoluteValue }.values
//            .forEach {
//            }
//
//    println(mode)
//    //println("${"%.1f".format(mean)}\n$median\n$mode")
