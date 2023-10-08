import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {

    var reader = Scanner(System.`in`)

    print("")
    var km: Double = reader.nextDouble()
    
    print("")
    var l: Double = reader.nextDouble()
    
    var dist: String = String.format("%.3f", km/l)
    
    println("$dist km/l")
}
