import java.util.Scanner
//dizendo o BEECROWD que tá errado, vou verificar depois
fun main(args: Array<String>) {

    print("")
    val a = readLine()
    
	val reader = Scanner(System.`in`)
	
	print("")
	var b:Double = reader.nextDouble()
	print("")
	var c:Double = reader.nextDouble()
	
	var vendas: Double = b + (c * 0.85)
	
	val roundoff = String.format("%.2f", vendas)
	
	
	println("TOTAL = $roundoff")
}
