import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`ìn`)
    
    print("")
    var r: Double  = reader.nextDouble()
    var pi: Double = 3.14159
    var esf = (4/3.0) * pi * (r*r*r)
    val roundoff = String.format("%.3f", esf)
    println("VOLUME = $roundoff")
}
