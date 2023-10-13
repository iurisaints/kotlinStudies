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
    

    if(b <= d){
        finalHour -= 1
        println("O JOGO DUROU $finalHour HORA(S) E $finalSec MINUTO(S)")
    } else {
        println("O JOGO DUROU $finalHour HORA(S) E $finalSec MINUTO(S)")
    }

}

fun hour(a: Int, c: Int): Int{
    if (a >= c){
        var hour = (a - c) - 24
        val finalHour = abs(hour)
        return finalHour
        
    } else if (a - c === -1){
        val finalHour = (a - c) + 1
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
