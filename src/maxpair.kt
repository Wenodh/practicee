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


/*
 * Complete the 'maxPairs' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY skillLevel
 *  2. INTEGER minDiff
 */

fun maxPairs(skillLevel: Array<Int>, minDiff: Int): Int {
    var a = skillLevel.sortedArray()
    var x = 0
    var y = 0
    loop@ for (i in 0..a.size - 2) {
        for (j in i + 1..a.size - 1) {
            if (a[j] - a[i] <= minDiff) {
                x = i
                y = j
                break@loop
            }
        }
    }
    var count = 0
    if (x >= 0 && y > 0) {
        for (i in x..x+a.size-y-1) {
            for (j in y..a.size - 1) {
                if (a[j] - a[i] <= minDiff) {
                    count++
                    break
                }
            }
        }
    }
    return count

}

fun main(args: Array<String>) {
    val skillLevelCount = readLine()!!.trim().toInt()

    val skillLevel = Array<Int>(skillLevelCount, { 0 })
    for (i in 0 until skillLevelCount) {
        val skillLevelItem = readLine()!!.trim().toInt()
        skillLevel[i] = skillLevelItem
    }

    val minDiff = readLine()!!.trim().toInt()

    val result = maxPairs(skillLevel, minDiff)

    println(result)
}