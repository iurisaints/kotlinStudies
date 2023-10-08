import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {

    var reader = Scanner(System.`in`)

    print("a: ")
    var a: Int = reader.nextInt()
    print("b: ")
    var b: Int = reader.nextInt()
    print("c: ")
    var c: Int = reader.nextInt()

    var maiorAB = (a+b+abs(a-b))/2
    var maiorABC = (maiorAB+c+abs(maiorAB-c))/2

    println("$maiorABC eh o maior")
}
