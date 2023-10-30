import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
	var teste: Int = 0
    
	for (i in 1..5) {
	    var num: Double = reader.nextDouble()
        var pair: Double = num % 2.0
        println(pair)
        if (pair == 0.0){
           teste += 1
        }
	}
    
    println("$teste valores pares")
	
}

//em construção
