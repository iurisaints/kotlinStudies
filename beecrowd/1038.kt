import java.util.*

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
	var a: Int = reader.nextInt()
	var b: Int = reader.nextInt()
	var soma: Double = 0.0
	
	if(a == 1){
	    soma = b * 4.00
	} else if(a == 2){
	    soma = b * 4.50
	} else if(a == 3){
	    soma = b * 5.00
	} else if(a == 4){
	    soma = b * 2.00
	} else if(a == 5){
	    soma = b * 1.50
	}
	
	var result = String.format("%.2f", soma)
	println("Total: R$ $result")
}
