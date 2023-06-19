package classes
import kotlin.concurrent.thread
import kotlin.system.exitProcess
import TrainingPlan
import exercises
import toBold
import wrapString


class BoxingTimer(var trainingPlans: MutableList<TrainingPlan>) {
        fun selectTrainingplan(plan: TrainingPlan) {
                //TODO: Logik zum Wählen von TrainingPlan
        }
}

fun startBoxingTimer() {
        var totalSeconds = exercises.sumOf { it.rounds * (it.duration + it.pause) }
        // Hinzufügen der zusätzlichen Pausen zur Gesamtzeit
        totalSeconds += (exercises.size - 1) * 60

        var remainingTotalSeconds = totalSeconds

        fun countdown(timeInSeconds: Int, action: String) {
                var timeRemaining = timeInSeconds
                while (timeRemaining >= 0) {
                        val formattedMinutes = String.format("%02d", remainingTotalSeconds / 60)
                        val formattedSeconds = String.format("%02d", remainingTotalSeconds % 60)
                        print("\r$action ${String.format("%02d", timeRemaining).toBold() + " Sekunden".toBold()} - (Gesamtzeit ${formattedMinutes.toBold()}:${formattedSeconds.toBold()})")
                        Thread.sleep(1000)
                        remainingTotalSeconds--
                        timeRemaining--
                }
                println()
        }

        for ((index, exercise) in exercises.withIndex()) {
                println("\n\n${wrapString(exercise.description, 50)}\n")
                for (round in 1..exercise.rounds) {
                        val action = "${exercise.name}, Runde $round von ${exercise.rounds} -"
                        countdown(exercise.duration, action)
                        if (round < exercise.rounds) {
                                val pauseAction = "${exercise.name}, Pause nach Runde $round -"
                                countdown(exercise.pause, pauseAction)
                        }
                }
                if (index < exercises.size - 1) { // Wenn es nicht die letzte Übung ist
                        val transitionAction = "Die nächste Übung beginnt in"
                        val exerciseBreak = String.format("%02d",exercise.nextExercise)
                                countdown(exerciseBreak.toInt(), transitionAction)
                }
        }

        println("\n\nDas Training ist beendet.")
}






/*
fun countdown(timeInSeconds: Int) {
        var timeRemaining = timeInSeconds

        while (timeRemaining >= 0) {
                print("\rVerbleibende Zeit: ${timeRemaining / 60} Minuten und ${timeRemaining % 60} Sekunden")
                Thread.sleep(1000)  // Warte für 1 Sekunde
                timeRemaining--
        }
}
*/
