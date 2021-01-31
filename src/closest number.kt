import java.util.*
import kotlin.math.abs

fun closestNumbers(arr: Array<Int>): IntArray {
    var max_diff = Int.MAX_VALUE
    var a = arr.sorted()
    var b = mutableListOf<Int>()
    for (i in 0 until arr.size-1){
        var diff = abs(a[i]-a[i+1])
        if (diff <= max_diff){
            if (diff < max_diff){
                max_diff = diff
                b.clear()
                b.add(a[i])
                b.add(a[i+1])
            } else {
                b.add(a[i])
                b.add(a[i + 1])
            }
        }
    }
    return b.toIntArray()
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = closestNumbers(arr)

    println(result.joinToString(" "))
}
