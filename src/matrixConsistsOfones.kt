fun main(){

    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        var a = readLine()!!.split(" ").map { it.toDouble() }.distinct().sorted()
        var count = 0
        for (i in 0..a.size-2){
            for (j in i..a.size-1){
                if(checkPerfectSquare(a[i]+a[j])){
                    count ++
                    break
                }
            }
        }
        println(count)
    }
}
fun checkPerfectSquare(number:Double):Boolean{
    val sq = Math.sqrt(number)
    val f = Math.floor(sq)
    return sq==f
}
