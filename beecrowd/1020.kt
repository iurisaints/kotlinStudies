import java.util.*

fun main(args: Array<String>) {
    var reader = Scanner.(System.`in`)
    print("")
    var dias: Int = reader.nextInt()
	var ano = dias/365
    var mes = (dias%365)/30
    var dia = ((dias%365)%30)
	println("$ano ano(s)")
	println("$mes mes(es)")
	println("$dia dias(s)")
}
