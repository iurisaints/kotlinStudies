// EM CONSTRUÇÃO!
import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
	var resultadoPar: Int = 0
	var resultadoImpar: Int = 0
	var resultadoPositivo: Int = 0
	var resultadoNegativo: Int = 0
    
	for (i in 1..6) {
	    var num: Double = reader.nextDouble()
	    if (num%2.0 === 0) {
	        resultadoPar += 1
	    }
	    if (num%2.0 !== 0) {
	        resultadoImpar += 1
	    }
        if (num >= 0) {
           resultadoPositivo += 1
        }
        if (num < 0) {
	        resultadoNegativo += 1
	    }
	}
    
    println("$resultado valores positivos")
	
}

//em construção
