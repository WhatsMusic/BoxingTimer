package classes.exercises

import Exercise
import classes.BoxingTimer

// Erstellen einer spezifischen Klasse für Warm-Up
class WarmUp(level: String) : Exercise(
    name = "Warm-Up",
    description = "The 5-minute warm-up is essential to prepare the body for the intensity of boxing.",
    rounds = when(level) {
        "Beginner" -> 1
        "Advanced" -> 1
        "Professional" -> 1
        "Demo" -> 1
        else -> 1 //Default-Wert
    },
    duration = when(level) {
        "Beginner" -> 300
        "Advanced" -> 300
        "Professional" -> 300
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
    nextExercise = when(level) {
        "Beginner" -> 60
        "Advanced" -> 60
        "Professional" -> 60
        "Demo" -> 10
        else -> 60 //Default-Wert
    }
)