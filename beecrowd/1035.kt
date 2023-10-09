import java.util.*

fun main(args: Array<String>) {

	var reader = Scanner(System.`in`)
	
	print("")
	var a: Int = reader.nextInt()
	print("")
	var b: Int = reader.nextInt()
	print("")
	var c: Int = reader.nextInt()
	print("")
	var d: Int = reader.nextInt()
	
	if(b > c && d > a && c+d > a+b && c > 0 && d > 0 && (a%2) === 0){
	    println("Valores aceitos")
	} else {
	    println("Valores nao aceitos")
	}
	
}
