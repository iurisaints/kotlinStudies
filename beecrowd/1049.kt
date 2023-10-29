import java.util.*

fun main(args: Array<String>) {

	var reader = Scanner(System.`in`)
    var subfilo: String = reader.next()
    var classe: String = reader.next()
    var dieta: String = reader.next()
	
	if (subfilo == "vertebrado") {
	    if (classe == "ave") {
	        if (dieta == "carnivoro"){
	            println("aguia")
	        } else if (dieta == "onivoro") {
	            println("pomba")
	        }
	    } else if (classe == "mamifero") {
	        if (dieta == "onivoro") {
	            println("homem")
	        } else if (dieta == "herbivoro") {
	            println("vaca")
	        }
	    }
	} else if (subfilo == "invertebrado") {
	    if (classe == "inseto") {
	        if (dieta == "hematofago") {
	            println("pulga")
	        } else if (dieta == "herbivoro") {
	            println("lagarta")
	        }
	    } else if (classe == "anelideo") {
	        if (dieta == "hematofago") {
	            println("sanguessuga")
	        } else if (dieta == "onivoro") {
	            println("minhoca")
	        }
	    }
	}
}
