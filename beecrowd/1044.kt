import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
	var a: Int = reader.nextInt()
    var b: Int = reader.nextInt()
    if((a%b) === 0 || (b%a) === 0){
        println("Sao Multiplos")
    } else {
        println("Nao sao Multiplos")
    }
}
