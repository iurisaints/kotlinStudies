import java.util.Scanner

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    var a: Int = reader.nextInt()
    var b: Int = reader.nextInt()
    var c: Int = reader.nextInt()
    var d: Int = reader.nextInt()

    var timeInit = a * 60 + b
    var timeFinal = c * 60 + d

    if (timeFinal <= timeInit) {
        println(one(timeInit, timeFinal))
       } else {
        println(two(timeInit, timeFinal))
       }
}

fun one(timeInit: Int, timeFinal: Int): String{
    val duration = (24 * 60 - timeInit) + timeFinal
    val finalHour = duration / 60
    val finalMinutes = duration % 60
    return "O JOGO DUROU $finalHour HORA(S) E $finalMinutes MINUTO(S)"
}

fun two(timeInit: Int, timeFinal: Int): String{
    val duration = timeFinal - timeInit
    val finalHour = duration / 60
    val finalMinutes = duration % 60
    return "O JOGO DUROU $finalHour HORA(S) E $finalMinutes MINUTO(S)"
}

//a mais dificil até agora
