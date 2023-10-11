import java.util.*

fun main(args: Array<String>) {

	var reader = Scanner(System.`in`)
	var a: Float = reader.nextFloat()
	var b: Float = reader.nextFloat()
	var c: Float = reader.nextFloat()
	var d: Float = reader.nextFloat()
	
	var n1: Float = a * 2
	var n2: Float = b * 3
	var n3: Float = c * 4
	var n4: Float = d * 1

    var media = (n1+n2+n3+n4)/10
    var mediaStr = String.format("%.1f", media)
    
    println("Media: $mediaStr")
    if(media >= 7.0){
        println("Aluno aprovado.")
    } else if (media >= 5.0 && media <= 6.9) {
        println("Aluno em exame.")
        var exame: Float = reader.nextFloat()
        println("Nota do exame: $exame")
        var mediaExame: Float = (exame + media) / 2
        var mediaStrExame = String.format("%.1f", mediaExame)
        if(mediaExame >= 5.0){
            println("Aluno aprovado.")
            println("Media final: $mediaStrExame")
        } else {
            println("Aluno reprovado.")
            println("Media final: $mediaStrExame")
        }
    } else if (media < 5.0){
        println("Aluno reprovado.")
    }
    
}
