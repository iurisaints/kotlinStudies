import java.util.*
import kotlin.math.*
import java.math.*

fun main(args: Array<String>) {
    
    var reader = Scanner(System.`in`)
    
    print("")
    var a: Double = reader.nextDouble()
    print("")
    var b: Double = reader.nextDouble()
    print("")
    var c: Double = reader.nextDouble()
    
    if(a==0.0 || ((b*b)-(4*a*c))<0){
        println("Impossivel calcular")
    } else {
        var x1 = (-b+sqrt((b*b)-(4*a*c)))/(2*a)
        var x2 = (-b-sqrt((b*b)-(4*a*c)))/(2*a)
        val r1 = String.format("%.5f", x1)
        val r2 = String.format("%.5f", x2)
        println("R1 = $r1")
        println("R2 = $r2")
    }
}
