fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()

    val adminOperatingSystem = "Manjaro"
    val adminEmailId = "iurisaints@gmail.com"

    println(displayAlertMessage(adminOperatingSystem, adminEmailId))
    println()
}

fun displayAlertMessage(a: String, b: String): String{
    return "\nThere's a new sign-in request on ${a} for your Google Account ${b}."
}
