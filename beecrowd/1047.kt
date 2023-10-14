import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {

	var reader = Scanner(System.`in`)
	var a: Int = reader.nextInt()
    var b: Int = reader.nextInt()
    var c: Int = reader.nextInt()
	var d: Int = reader.nextInt()
    
    var finalHour = hour(a, c)
    var finalSec = secs(b, d)
    

    if(d <= b){
        finalHour -= 1
        println("O JOGO DUROU $finalHour HORA(S) E $finalSec MINUTO(S)")
    } else {
        println("O JOGO DUROU $finalHour HORA(S) E $finalSec MINUTO(S)")
    }

}

fun hour(a: Int, c: Int): Int{
    if (c > a){
        var hour = (c - a)
        val finalHour = abs(hour)
        return finalHour
    } else if (a <= c){
        val finalHour = (a - c) + 24
        return finalHour
    } else {
        val finalHour = (c - a)
        return finalHour
    }
}


fun secs(b: Int, d: Int): Int{
    if(d < b) {
        var sec = (b - d) - 60
        val finalSec = abs(sec)
        return finalSec
    } else {
        val finalSec = d - b
        return finalSec
    }
}
