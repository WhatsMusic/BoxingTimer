package classes.exercises

import classes.Exercise
import classes.BoxingTimer

// Erstellen einer spezifischen Klasse für Sparring
class Sparring(level: String) : Exercise(
    name = "Sparring",
    description = "Sparring is a practical, controlled application of boxing techniques against an opponent, often under the supervision of a coach.",
    rounds = when(BoxingTimer.selectedLevel) {
        "Beginner" -> 3
        "Advanced" -> 5
        "Professional" -> 6
        "Demo" -> 2
        else -> 1 //Default-Wert
    },
    duration = when(BoxingTimer.selectedLevel) {
        "Beginner" -> 180
        "Advanced" -> 180
        "Professional" -> 180
        "Demo" -> 15
        else -> 10 //Default-Wert
    },
    pause = when(BoxingTimer.selectedLevel) {
        "Beginner" -> 60
        "Advanced" -> 60
        "Professional" -> 60
        "Demo" -> 5
        else -> 10 //Default-Wert
    },
    level = level,
    nextExercise = when(BoxingTimer.selectedLevel) {
        "Beginner" -> 60
        "Advanced" -> 60
        "Professional" -> 60
        "Demo" -> 10
        else -> 60 //Default-Wert
    }
)