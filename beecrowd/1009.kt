import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    
    print("")
    val a = reader.nextLine()
    
    print("")
    val b: Double = reader.nextDouble()
    
    print("")
    val c: Double = reader.nextDouble()
    
    val vendas: Double = b + c * 0.15
    
    val roundoff = String.format("%.2f", vendas)
    
    println("TOTAL = R$ $roundoff")
}
