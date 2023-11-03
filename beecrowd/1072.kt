import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
	var x: Int = reader.nextInt()
    var inNum: Int = 0
    var outNum: Int = 0

    for(i in 1..x){
        var y: Int = reader.nextInt()
        if(y >= 10 && y <= 20){
            inNum += 1
        } else if (y < 10 || y > 20) {
            outNum += 1
        }
    }

    println("$inNum in")
    println("$outNum out")
    
}
