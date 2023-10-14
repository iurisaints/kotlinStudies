import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    while (true) {
        val n = reader.nextInt()
        if (n <= 0) {
            break
        }
        
        val m = reader.nextInt()
        if (m <= 0) {
            break
        }

        val (inicio, fim) = if (n < m) {
            n to m
        } else {
            m to n
        }

        var soma = 0
        val numerosUsados = mutableListOf<Int>()

        for (i in inicio..fim) {
            numerosUsados.add(i)
            soma += i
        }

        println("${numerosUsados.joinToString(", ")} Soma=$soma")
    }
}
