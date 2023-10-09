import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    
    var reader = Scanner(System.`in`)
	
	print("")
	var x1: Double = reader.nextDouble()
	print("")
	var y1: Double = reader.nextDouble()
	print("")
	var x2: Double = reader.nextDouble()
	print("")
	var y2: Double = reader.nextDouble()
	
	var plano: String = String.format("%.4f", sqrt((x2-x1).pow(2) + (y2-y1).pow(2)))
    
    println("$plano")
}
