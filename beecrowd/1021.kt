import java.util.*

fun main(args: Array<String>) {

	var reader = Scanner(System.`in`)
    
    print("")
    var valor: Double = reader.nextDouble()

    println("NOTAS:")
    var cem = valor/100
    var intecem = cem.toInt()
    println("$intecem nota(s) de R$ 100.00")
    var cinquenta = ((valor%100)/50)
    var intecinquenta = cinquenta.toInt()
    println("$intecinquenta nota(s) de R$ 50.00")
    var vinte = (((valor%100)%50)/20)
    var intevinte = vinte.toInt()
    println("$intevinte nota(s) de R$ 20.00")
    var dez = (((valor%100)%50)%20)/10
    var intedez = dez.toInt()
    println("$intedez nota(s) de R$ 10.00")
    var cinco = ((((valor%100)%50)%20)%10)/5
    var intecinco = cinco.toInt()
    println("$intecinco nota(s) de R$ 5.00")
    var dois = (((((valor%100)%50)%20)%10)%5)/2
    var intedois = dois.toInt()
    println("$intedois nota(s) de R$ 2.00")

    var moedas: Double = monedas(valor)
    println("MOEDAS:")
    var um = ((((((valor%100)%50)%20)%10)%5)%2)/1
    var inteum = um.toInt()
    println("$inteum moeda(s) de R$ 1.00")
    var cinquentinha = moedas/0.50
    var intecinquentinha = cinquentinha.toInt()
    println("$intecinquentinha moeda(s) de R$ 0.50")
    var vintcinco= (moedas%0.50)/0.25 
    var intevintcinco = vintcinco.toInt()
    println("$intevintcinco moeda(s) de R$ 0.25")
    var dezinho = ((moedas%0.50)%0.25)/0.10
    var intedezinho = dezinho.toInt()
    println("$intedezinho moeda(s) de R$ 0.10")
    var cinquinho = (((moedas%0.50)%0.25)%0.10)/0.05
    var intecinquinho = cinquinho.toInt()
    println("$intecinquinho moeda(s) de R$ 0.05")
    var umzin = ((((moedas%0.50)%0.25)%0.10)%0.05)/0.01
    var inteumzin = String.format("%.0f", umzin)
    println("$inteumzin moeda(s) de R$ 0.01")

}

fun monedas(valor: Double): Double {

    val integer = valor.toInt()
    val fract = valor - integer

    return fract
}
