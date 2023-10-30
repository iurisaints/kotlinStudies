import java.util.*

fun main(args: Array<String>) {
  val reader = Scanner(System.`in`)
	var teste: Int = 0
  var listaNums = ArrayList<Double>()
    
	for (i in 1..6) {
	    var num: Double = reader.nextDouble()
        if (num > 0){
           listaNums.add(num)
           teste += 1
        }
	}
    
    var avgPositivos = listaNums.average()
    var roundAvg = String.format("%.1f", avgPositivos)
    
    println("$teste valores positivos")
	  println("$roundAvg")
}
