import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
	var x: Int = reader.nextInt()

    for(i in 1..x){
        if(i%2 != 0){
            println("$i")
        }
    }
}
