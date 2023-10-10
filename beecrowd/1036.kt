import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    
    var reader = Scanner(System.`in`)
    
    print("")
    var a: Double = reader.nextDouble()
    print("")
    var b: Double = reader.nextDouble()
    print("")
    var c: Double = reader.nextDouble()
	
	var delta = (b*b)-4*a*c
    
    if(delta <= 0){
        println("Impossivel calcular")
    } else {
        var x1 = (-b+sqrt(delta))/(2*a)
        var x2 = (-b-sqrt(delta))/(2*a)
        val r1 = String.format("%.5f", x1)
        val r2 = String.format("%.5f", x2)
        println("R1 = $r1")
        println("R1 = $r2")
    }
}


//pair josé e paulo
