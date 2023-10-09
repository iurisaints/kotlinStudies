import java.util.*

fun main(args: Array<String>) {

    print("")
    var tempo:Int = 140153
  	var horas = (tempo/60)/60
    var minutos = tempo/60
    var segundos = minutos%60
    
    print("$horas:$minutos:$segundos")
    
}
