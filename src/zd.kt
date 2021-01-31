import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the bigSorting function below.
fun quickSort(arr: Array<Int>): List<Int> {
    var p = arr[0]
    var left = arrayListOf<Int>()
    var right = arrayListOf<Int>()
    var equall = arrayListOf<Int>()
    arr.forEach {
        if (it == p) equall.add(it)
        else if (it > p) right.add(it)
        else left.add(it)
    }
    return left + equall + right
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = quickSort(arr)

    println(result.joinToString(" "))
}

