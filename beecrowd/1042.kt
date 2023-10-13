import java.util.*

fun main(args: Array<String>) {

    var reader = Scanner(System.`in`)

    var arr = intArrayOf()

    var a: Int = reader.nextInt()

    var b: Int = reader.nextInt()

    var c: Int = reader.nextInt()

    arr += a

    arr += b

    arr += c

    

    arr.sort()

    

    println(arr[0])

    println(arr[1])

    println(arr[2])

    println("\n$a\n$b\n$c")

    

    

}
