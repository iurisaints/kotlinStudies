import java.util.*

fun main(args: Array<String>) {

	val reader = Scanner(System.`in`)
	var salario: Double = reader.nextDouble()
	
	if (salario <= 400.00){
	    var novoSalario = salario + (salario*0.15)
	    val salarioRound = String.format("%.2f", novoSalario)
	    println("Novo salario: $salarioRound")
	    var reajuste = novoSalario - salario
	    val reajusteRound = String.format("%.2f", reajuste)
	    println("Reajuste ganho: $reajusteRound")
	    println("Em percentual: 15 %")
	    
	} else if (salario <= 800.00) {
    
	    var novoSalario = salario + (salario*0.12)
	    val salarioRound = String.format("%.2f", novoSalario)
	    println("Novo salario: $salarioRound")
	    var reajuste = novoSalario - salario
	    val reajusteRound = String.format("%.2f", reajuste)
	    println("Reajuste ganho: $reajusteRound")
	    println("Em percentual: 12 %")
	    
	} else if (salario <= 1200.00) {
	    var novoSalario = salario + (salario*0.10)
	    val salarioRound = String.format("%.2f", novoSalario)
	    println("Novo salario: $salarioRound")
	    var reajuste = novoSalario - salario
	    val reajusteRound = String.format("%.2f", reajuste)
	    println("Reajuste ganho: $reajusteRound")
	    println("Em percentual: 10 %")
      
	} else if (salario <= 2000.00) {
	    var novoSalario = salario + (salario*0.07)
	    val salarioRound = String.format("%.2f", novoSalario)
	    println("Novo salario: $salarioRound")
	    var reajuste = novoSalario - salario
	    val reajusteRound = String.format("%.2f", reajuste)
	    println("Reajuste ganho: $reajusteRound")
	    println("Em percentual: 7 %")
      
	} else if (salario > 2000.00) {
	    var novoSalario = salario + (salario*0.04)
	    val salarioRound = String.format("%.2f", novoSalario)
	    println("Novo salario: $salarioRound")
	    var reajuste = novoSalario - salario
	    val reajusteRound = String.format("%.2f", reajuste)
	    println("Reajuste ganho: $reajusteRound")
	    println("Em percentual: 4 %")
	}
	
}
