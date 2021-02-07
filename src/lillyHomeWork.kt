import java.util.*

fun lilysHomework(arr: Array<Int>): Int {
    //var arr =arr
    var result = 0
    var a = hashMapOf<Int,Int>()
    for (i in 0..arr.size-1){
        a[arr[i]]=i
    }

    var b = arr.sorted()
    for(i in 0..arr.size-1){
        if (arr[i]!=b[i]){
            result++
            var toSwap = a[b[i]]
            arr[i]= arr[toSwap!!].also { arr[toSwap] = arr[i] }
            a[arr[i]] = toSwap
        }
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = lilysHomework(arr)

    println(result)
}
