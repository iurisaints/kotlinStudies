import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    
    val A = reader.nextDouble()
    val B = reader.nextDouble()
    val C = reader.nextDouble()

    if (isTriangle(A, B, C)) {
        val perimeter = A + B + C
        println("Perimetro = ${perimeter}")
    } else {
        val area = 0.5 * (A + B) * C
        println("Area = ${area}")
    }
}

fun isTriangle(A: Double, B: Double, C: Double): Boolean {
    return A + B > C && A + C > B && B + C > A
}
