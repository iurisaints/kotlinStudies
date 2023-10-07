import java.util.*

fun main(args: Array<String>) {
    print("")
    var reader = Scanner(System.`in`)
    
    print("")
    var cod: Int = reader.nextInt()

    print("")
    var num: Int = reader.nextInt()
    
    print("")
    var unit: Double = reader.nextDouble()
    
    print("")
    var cod2: Int = reader.nextInt()

    print("")
    var num2: Int = reader.nextInt()
    
    print("")
    var unit2: Double = reader.nextDouble()
    
    var result = (num * unit) + (num2 * unit2)
    val roundoff = String.format("%.2f", result)
    
    println("VALOR A PAGAR: R$ $roundoff")
}
