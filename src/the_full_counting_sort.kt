import java.io.*
import java.util.*
fun main(){
    val size = readLine()!!.toInt()
    var result = arrayListOf<List<String>>()
    (1..size)
            .map { _ -> readLine()!!.split(" ").toMutableList() }
            .mapIndexedTo (result){ index, mutableList ->
                if (index<size/2) mutableList[1]="-"
                mutableList
            }
    result.sortBy { it[0].toInt() }
    println(result.map { it[1] }.joinToString(" "))
}