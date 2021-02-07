import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.math.max
import kotlin.ranges.*
import kotlin.text.*

// Complete the insertionSort1 function below.
fun maxSubarrayValue(arr: Array<Int>): Long {
    var a = LinkedList<Int>()
    var b = LinkedList<Int>()
    for (i in 0..arr.size - 1) {
        if (i % 2 == 0) {
            a.add(arr[i])
        } else b.add(arr[i])
    }
    var temp = a.sum().toLong() - b.sum().toLong()

    repeat(arr.size - 3) {
        var result = 1L
        if (a.size == b.size) {
            if (arr.indexOf(a.first) < arr.indexOf(b.first)) {
                if (abs(a.first) > abs(b.last)) {
                    b.remove(b.last())
                    result = a.sum().toLong() - b.sum().toLong()
                } else {
                    a.remove(a.first)
                    result = a.sum().toLong() - b.sum().toLong()
                }
                temp = max(abs(temp), abs(result))
            } else {
                if (abs(b.first) > abs(a.last)) {
                    a.remove(a.last())
                    result = a.sum().toLong() - b.sum().toLong()
                } else {
                    b.remove(b.first)
                    result = a.sum().toLong() - b.sum().toLong()
                }
                temp = max(abs(temp), abs(result))
            }
        } else if (a.size > b.size) {
            if (abs(a.first) > abs(a.last)) {
                a.remove(a.last)
                result = a.sum().toLong() - b.sum().toLong()
            } else {
                a.remove(a.last)
                result = a.sum().toLong() - b.sum().toLong()
            }
            temp = max(abs(temp), abs(result))
        } else {
            if (abs(b.first) > abs(b.last)) {
                b.remove(b.last)
                result = a.sum().toLong() - b.sum().toLong()
            } else {
                b.remove(b.last)
                result = a.sum().toLong() - b.sum().toLong()
            }
            temp = max(abs(temp), abs(result))
        }
    }
    return temp * temp
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = Array<Int>(arrCount, { 0 })
    for (i in 0 until arrCount) {
        val arrItem = readLine()!!.trim().toInt()
        arr[i] = arrItem
    }

    val result = maxSubarrayValue(arr)

    println(result)
}
fun maxSubArray(nums: IntArray): Int {
    var max_so_far = nums[0]
    var max_ending = 0
    var start = 0
    var end  = 0
    var s= 0
    for(i in 0..nums.size-1){
        max_ending +=nums[i]
        if(max_so_far< max_ending){
            max_so_far = max_ending
            start = s
            end = i
        }
        if(max_ending<0){
            max_ending = 0
            s =i+1
        }
    }
    return max_so_far
}


