import java.util.*

fun main(args: Array<String>) {
    
    val reader = Scanner(System.`in`)
	val ini: Int = reader.nextInt()
	val fim: Int = reader.nextInt()
	
	if(ini > fim){
	    var tempo = (24 - ini) + fim
	    println("O JOGO DUROU $tempo HORA(S)")
	} else {
	    var tempo = fim - ini
	    println("O JOGO DUROU $tempo HORA(S)")
	}
}
