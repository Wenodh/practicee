fun main() {
    val (n, q) = read()
    var s = readLine()!!.toCharArray().sorted()
    var z = hashMapOf<Int, Char>()
    for (i in 0..n-1){
        z[i+1] = s[i]
    }

//    for (i in 'a'..'z') {
//        z[i] = 0
//    }
//    for (i in 0..n-1){
//        z[s[i]]= z[s[i]]!! +1
//    }
    println(z)
//    repeat(q) {
//        val (start, stop, find) = read()
//        println(s[start + find - 1])
//    }
}

private fun read() = readLine()!!.split(" ").map { it.toInt() }