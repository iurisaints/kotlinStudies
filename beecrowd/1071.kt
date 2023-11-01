//em construção

import java.util.*

fun main(args: Array<String>) {
    
    var reader = Scanner(System.`in`)
	var n: Int = reader.nextInt()
    var m: Int = reader.nextInt()
    var maior: Int
    var menor: Int
    var o: Int = 0

    if (n > m) {
        maior = n
        menor = m
    } else {
        maior = m
        menor = n
    }

	for(i = (menor + 1); i < maior; i++){
	    if (i%2 !== 0) {
	        o += n 
	    }
	}
    println("$o")
}
