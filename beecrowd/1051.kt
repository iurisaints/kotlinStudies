import java.util.*

fun main(args: Array<String>) {

	val reader = Scanner(System.`in`)
	var valor: Float = reader.nextFloat()
  var imposto: Double
  var valorImposto: Double
	
	if (valor <= 2000.00) {
	    println("Isento")
	} else if (valor > 2000.00 && valor <= 3000.00){
	    valor -= 2000.00
	    imposto = valor * 0.08
	    val roundImposto: String = String.format("%.2f", imposto)
	    println("R$ $roundImposto")
	} else if (valor <= 4500.00){
	    valor -= 3000.00
	    imposto = (valor * 0.18) + 1000 * 0.08
	    val roundImposto = String.format("%.2f", imposto)
	    println("R$ $roundImposto")
	} else if (valor > 4500.00){
	    valor -= 4500.00
	    imposto = (valor * 0.28) + 1500 * 0.18 + 1000 * 0.08
	    val roundImposto = String.format("%.2f", imposto)
	    println("R$ $roundImposto")
	}
	
}
