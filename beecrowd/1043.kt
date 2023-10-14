import java.util.*

fun main(args: Array<String>) {

	val reader = Scanner(System.`in`)
	val a: Float = reader.nextFloat()
	val b: Float = reader.nextFloat()
	val c: Float = reader.nextFloat()
	
	var forma = (b*c)/2
	
	if (a === forma) {
	    println("Area = $forma")
	}
}
