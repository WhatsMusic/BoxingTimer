class TrainingPlan(
    var name: String,
    var exercises: MutableList<Exercise>,
    var level: String
) {
    var totalDuration: Int = exercises.sumOf { it.rounds * (it.duration + it.pause) }
    val minutes: Int = totalDuration / 60
    val seconds: Int = totalDuration % 60
    var numExercises: Int = exercises.size

    init {
        name = level
    }


    fun startPlan() {
        //TODO: Logik um die Übungen in einer Schleife zu durchlaufen und für jede Übung einen Timer zu starten
    }

}
val plan = TrainingPlan(
    name = selectedLevel,
    exercises = exercises,
    level = selectedLevel
)

