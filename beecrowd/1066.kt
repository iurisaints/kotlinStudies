import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
	var resultadoPar: Int = 0
	var resultadoImpar: Int = 0
	var resultadoPositivo: Int = 0
	var resultadoNegativo: Int = 0
    
	for (i in 1..5) {
	    var num: Double = reader.nextDouble()
	    if (num%2.0 == 0.0) {
	        resultadoPar += 1
	    }
	    if (num%2.0 != 0.0) {
	        resultadoImpar += 1
	    }
        if (num > 0.0) {
           resultadoPositivo += 1
        }
        if (num < 0.0) {
	        resultadoNegativo += 1
	    }
	}

    println("$resultadoPar valor(es) par(es)")
    println("$resultadoImpar valor(es) impar(es)")
    println("$resultadoPositivo valor(es) positivo(s)")
    println("$resultadoNegativo valor(es) negativo(s)")
	
}
