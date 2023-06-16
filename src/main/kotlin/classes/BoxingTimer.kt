import kotlin.concurrent.thread

class BoxingTimer(var trainingPlans: MutableList<TrainingPlan>) {
        fun selectTrainingplan(plan: TrainingPlan) {
                //TODO: Logik zum Wählen von TrainingPlan
        }
}

fun startBoxingTimer() {
        val totalSeconds = exercises.sumOf { it.rounds * (it.duration + it.pause) }
        var remainingTotalSeconds = totalSeconds
        val totalTimerThread = thread(start = true) {
                while (remainingTotalSeconds >= 0) {
                        println("Verbleibende Gesamtzeit: ${remainingTotalSeconds / 60} Minuten und ${remainingTotalSeconds % 60} Sekunden")
                        Thread.sleep(1000)  // Warte für 1 Sekunde
                        remainingTotalSeconds--
                }
        }

        for (exercise in exercises) {
                println("Starting exercise: ${exercise.name}")
                for (round in 1..exercise.rounds) {
                        println("Round $round of ${exercise.rounds}")
                        countdown(exercise.duration)
                        if (round < exercise.rounds) {  // Don't wait after the last round
                                println("Pause")
                                countdown(exercise.pause)
                        }
                }
        }

        totalTimerThread.join()  // Wait for the total timer to finish if it's still running
        println("Das Training ist beendet.")
}

fun countdown(timeInSeconds: Int) {
        var timeRemaining = timeInSeconds

        while (timeRemaining >= 0) {
                print("\rVerbleibende Zeit: ${timeRemaining / 60} Minuten und ${timeRemaining % 60} Sekunden")
                Thread.sleep(1000)  // Warte für 1 Sekunde
                timeRemaining--
        }
}

