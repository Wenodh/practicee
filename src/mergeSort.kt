fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        var a = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        a.sort()
        println(a.joinToString(" "))
    }
}

fun merge_sort(a: IntArray, dummy: IntArray = IntArray(a.size), start: Int = 0, end: Int =a.size-1) {
    if (start < end) {
        var mid = (start + end) / 2
        merge_sort(a, dummy, start, mid)
        merge_sort(a, dummy, mid + 1, end)
        merge(a, dummy, start, mid, end)
    }
}

fun merge(a: IntArray, dummy: IntArray, start: Int, mid: Int, end: Int) {
    for (i in start..end) dummy[i] = a[i]
    var dummyLeft = start
    var dummyRight = mid + 1
    var current = start
    while (dummyLeft <= mid && dummyRight <= end) { // c) condition to check helper left and helper right
        if (dummy[dummyLeft] >= dummy[dummyRight]) { // d) Check if value at helperLeft index is less than that of value at helper right
            a[current] = dummy[dummyLeft]
            dummyLeft++
        } else { // e) right element is smaller than left element
            a[current] = dummy[dummyRight]
            dummyRight++
        }
        current++
    }

// f) copy the rest of leftside of array into target
    val remaining = mid - dummyLeft
    for (i in 0..remaining) {
        a[current + i] = dummy[dummyLeft + i]
    }
}