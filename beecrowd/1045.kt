import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    var um: Double = reader.nextDouble()
    var dois: Double = reader.nextDouble()
    var tres: Double = reader.nextDouble()

    var a: Double
    var b: Double
    var c: Double

    if (um >= dois && um >= tres) {
        a = um
        b = if (dois >= tres) dois else tres
        c = if (dois <= tres) dois else tres
    } else if (dois >= um && dois >= tres) {
        a = dois
        b = if (um >= tres) um else tres
        c = if (um <= tres) um else tres
    } else {
        a = tres
        b = if (um >= dois) um else dois
        c = if (um <= dois) um else dois
    }

    val a2 = a * a
    val b2 = b * b
    val c2 = c * c

    if (a >= b + c) {
        println("NAO FORMA TRIANGULO")
    } else {
        if (a2 == b2 + c2) {
            println("TRIANGULO RETANGULO")
        }
        if (a2 > b2 + c2) {
            println("TRIANGULO OBTUSANGULO")
        }
        if (a2 < b2 + c2) {
            println("TRIANGULO ACUTANGULO")
        }
        if (a == b && a == c) {
            println("TRIANGULO EQUILATERO")
        }
        if (a == b || b == c || c == a) {
            println("TRIANGULO ISOSCELES")
        }
    }
}
