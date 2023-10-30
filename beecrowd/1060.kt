import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
	var teste: Int = 0
    
	for (i in 1..6) {
	    var num: Double = reader.nextDouble()
        if (num >= 0){
           teste += 1
        }
	}
    
    println("$teste valores positivos")
	
}

//em construção
