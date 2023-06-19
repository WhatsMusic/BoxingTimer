
import classes.BoxingTimer

class TrainingPlan(
    var name: String,
    var exercises: MutableList<Exercise>,
    var level: String
) {

    companion object {


        fun startTraining() {
            var totalSeconds = exercises.sumOf { (it.rounds * (it.duration + it.pause) + it.nextExercise) -1 }
            // Hinzufügen der zusätzlichen Pausen zur Gesamtzeit
            //totalSeconds += (exercises.size - 1)

            var remainingTotalSeconds = totalSeconds

            fun countdown(timeInSeconds: Int, action: String) {
                var timeRemaining = timeInSeconds
                while (timeRemaining >= 0) {
                    val formattedMinutes = String.format("%02d", remainingTotalSeconds / 60)
                    val formattedSeconds = String.format("%02d", remainingTotalSeconds % 60)
                    print("\r$action ${String.format("%02d", timeRemaining).toBold() + " seconds".toBold()} - (Total Time ${formattedMinutes.toBold()}:${formattedSeconds.toBold()})")
                    Thread.sleep(1000)
                    remainingTotalSeconds--
                    timeRemaining--
                }
                println()
            }

            for ((index, exercise) in exercises.withIndex()) {
                println("\n\n${wrapString(exercise.description, 50)}\n")
                for (round in 1..exercise.rounds) {
                    val action = "${exercise.name}, Round $round of ${exercise.rounds} -"
                    countdown(exercise.duration, action)
                    if (round < exercise.rounds) {
                        val pauseAction = "${exercise.name}, break after round $round -"
                        countdown(exercise.pause, pauseAction)
                    }
                }
                if (index < exercises.size - 1) { // Wenn es nicht die letzte Übung ist
                    val transitionAction = "The next exercise starts in"
                    val exerciseBreak = String.format("%02d",exercise.nextExercise)
                    countdown(exerciseBreak.toInt(), transitionAction)
                }
            }

            println("\n\nThe training is finished.")
        }

        fun showTrainingPlan() {
            var totalSeconds = exercises.sumOf { (it.rounds * (it.duration + it.pause) + it.nextExercise) -1 }
            // Hinzufügen der zusätzlichen Pausen zur Gesamtzeit
            //totalSeconds += (exercises.size - 1)
            val formattedMinutes = String.format("%02d", totalSeconds / 60)
            val formattedSeconds = String.format("%02d", totalSeconds % 60)

            print("Training-Plan: ${plan.name}, \nTotal time ${formattedMinutes.toBold()}:${formattedSeconds.toBold()}".toBold() + " Minutes, \nNumber of Exercises: ${plan.numExercises}".toBold())
        }
    }

        var totalDuration: Int = exercises.sumOf { it.rounds * (it.duration + it.pause) }
        var minutes: Int = totalDuration / 60
        var seconds: Int = totalDuration % 60
        var numExercises: Int = exercises.size

    init {
        name = BoxingTimer.selectedLevel
        totalDuration = exercises.sumOf { it.rounds * (it.duration + it.pause) }
        numExercises = exercises.size
    }


}


val plan = TrainingPlan(
    name = BoxingTimer.selectedLevel,
    exercises = exercises,
    level = BoxingTimer.selectedLevel
)

