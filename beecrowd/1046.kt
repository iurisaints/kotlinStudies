import java.util.*

fun main(args: Array<String>) {
    
    val reader = Scanner(System.`in`)
	val ini: Int = reader.nextInt()
	val fim: Int = reader.nextInt()
  // sério, fiz o ini == fim no else if e não foi, cara... fiquei quebrando a cabeça depois e vi que devia ser antes, enfim...	
	if (ini == fim) {
        println("O JOGO DUROU 24 HORA(S)")
	} else if (ini > fim) {
	    var tempo = (24 - ini) + fim
	    println("O JOGO DUROU $tempo HORA(S)")
	} else {
	    var tempo = fim - ini
	    println("O JOGO DUROU $tempo HORA(S)")
	}
}
