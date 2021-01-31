fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val arr = Array<Int>(n) { 0 }
    val a = Array<String>(n) { " " }
    var zero = mutableListOf<String>()
    var one = mutableListOf<String>()
    var two = mutableListOf<String>()
    var three = mutableListOf<String>()
    var four = mutableListOf<String>()
    var five = mutableListOf<String>()
    var six = mutableListOf<String>()
    var seven = mutableListOf<String>()
    var eight = mutableListOf<String>()
    var nine = mutableListOf<String>()
    for (i in 0 until n) {
        var s = readLine()!!.trimEnd().split(" ")
        if (i < n / 2) {
            a[i] = "-"
        } else {
            a[i] = s.last()
        }
        arr[i] = s.first().toInt()
        when (arr[i]) {
            0 -> zero.add(a[i])
            1 -> one.add(a[i])
            2 -> two.add(a[i])
            3 -> three.add(a[i])
            4 -> four.add(a[i])
            5 -> five.add(a[i])
            6 -> six.add(a[i])
            7 -> seven.add(a[i])
            8 -> eight.add(a[i])
            else -> nine.add(a[i])
        }
    }
    zero.forEach { print("$it ") }
    one.forEach { print("$it ") }
    two.forEach { print("$it ") }
    three.forEach { print("$it ") }
    four.forEach { print("$it ") }
    five.forEach { print("$it ") }
    six.forEach { print("$it ") }
    seven.forEach { print("$it ") }
    eight.forEach { print("$it ") }
    nine.forEach { print("$it ") }

}


//fun countingSort(arr: Array<Int>): Array<Int> {
//    var a = Array(100) { 0 }
//
//    arr.forEach {a[it]++ }
//    return a
//}
//
//fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val n = scan.nextLine().trim().toInt()
//
//    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
//
//    val result = countingSort(arr)
//
//    println(result.joinToString(" "))
//}