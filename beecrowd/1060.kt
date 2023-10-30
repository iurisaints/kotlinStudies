import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
	var teste: Int = 0
    
	for (i in 1..6) {
	    var num: Int = reader.nextInt()
        if (num > 0){
           teste += 1
        }
	}
    
    println("$teste")
	
}

//em construção
