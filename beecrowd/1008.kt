import java.util.*

fun main(args: Array<String>) {

	val reader = Scanner(System.`in`)
	print("")
	var a:Int = reader.nextInt()
	print("")
	var b:Int = reader.nextInt()
	print("")
	var c: Double = reader.nextDouble()
	var salary: Double = b * c
	val roundoff = String.format("%.2f", salary)
	
	println("NUMBER = $a")
	println("SALARY = U$ $roundoff")
}
