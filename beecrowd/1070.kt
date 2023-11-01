import java.util.*

fun main(args: Array<String>) {
    
    var reader = Scanner(System.`in`)
	var n: Int = reader.nextInt()
    var i = 0
	while(i < 6){
	    if (n%2 !== 0) {
	        println("$n")
	        i += 1
	    }
	   n += 1
	}
}
