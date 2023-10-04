fun main() {
    val steps = 4000
    val caloriesBurned = pedometerSTC(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerSTC(numberOfSteps: Int): Double {
    val caloriesForEachStep = 0.04
    val totalBurned = numberOfSteps * caloriesForEachStep
    return totalBurned
}
