import java.util.*

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    var x: Double = reader.nextDouble()
    var y: Double = reader.nextDouble()
    
    if (x === 0.0 && y === 0.0){
        println("Origem")
    } else if (x !== 0.0 && y === 0.0 ) {
        println("Eixo X")
    } else if (x === 0.0 && y !== 0.0 ) {
        println("Eixo Y")
    } else if (x > 0.0 && y > 0.0 ) {
        println("Q1")
    } else if (x < 0.0 && y > 0.0 ) {
        println("Q2")
    } else if (x < 0.0 && y < 0.0 ) {
        println("Q3")
    } else if (x > 0.0 && y < 0.0 ) {
        println("Q4")
    }
}
