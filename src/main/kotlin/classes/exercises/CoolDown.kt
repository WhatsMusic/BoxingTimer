package classes.exercises

import Exercise
import classes.BoxingTimer

// Erstellen einer spezifischen Klasse für Cool-Down
class CoolDown(level: String) : Exercise(
    name = "Cool-Down",
    description = "The cool-down phase is the final stage of a boxing training session, aimed at gradually reducing the heart rate and relaxing the muscles.",
    rounds = when(level) {
        "Beginner" -> 1
        "Advanced" -> 1
        "Professional" -> 1
        "Demo" -> 1
        else -> 1 //Default-Wert
    },
    duration = when(level) {
        "Beginner" -> 600
        "Advanced" -> 600
        "Professional" -> 600
        "Demo" -> 10
        else -> 10 //Default-Wert
    },
    pause = when(level) {
        "Beginner" -> 0
        "Advanced" -> 0
        "Professional" -> 0
        "Demo" -> 0
        else -> 0 //Default-Wert
    },
    level = BoxingTimer.selectedLevel,
    nextExercise = 0
)