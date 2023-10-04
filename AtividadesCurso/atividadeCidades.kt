fun main() {
    news("Ankara", 27, 31, 82)

    news("Tokyo", 32, 36, 10)

    news("Cape Town", 59, 64, 2)
    
    news("Guatemala City", 50, 55, 7)
}

fun news(city: String, lowT: Int, highT: Int, chanceRain: Int): String {
    
    return "City: $city \nLow temperature: $lowT, High temperature: $highT \nChance of rain: $chanceRain% \n"

}