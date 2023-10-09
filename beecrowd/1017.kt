import java.util.*

fun main(args: Array<String>) {

    var reader = Scanner(System.`in`)
    
    print("")
    var h = reader.nextDouble()
    print("")
    var l = reader.nextDouble()
	var result = String.format("%.3f", ((l/12)*h))
	
	println("$result")
	
}
