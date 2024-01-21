import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
	var x: Int = reader.nextInt()
    var soma: Int = 0

    for(i in 1..x){
        if(i%2==0){
            soma = i*i
            print("$i^2 = $soma\n")
        }
    }    
}
