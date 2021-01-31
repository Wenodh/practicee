import java.util.*

fun insertionSort(arr: Array<Int>): Int {
    var arr =arr
    var count = 0
    for (current in 1..arr.size - 2) {
        //if (arr[current] > arr[current + 1]) {
            for (swap in current downTo 0) {
                if (arr[swap] < arr[swap - 1]) {
                    arr[swap] = arr[swap - 1].also { arr[swap - 1] = arr[swap] }
                    count++
                }else break
            }
        //}
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        val result = insertionSort(arr)

        println(result)
    }
}
