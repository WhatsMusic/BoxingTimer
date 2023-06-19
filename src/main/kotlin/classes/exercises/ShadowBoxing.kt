package classes.exercises

import Exercise

// Erstellen einer spezifischen Klasse für ShadowBoxing
class ShadowBoxing(level: String) : Exercise(
    name = "Shadow-Boxing",
    description = "Shadow boxing focuses on the execution of movements and the perfection of techniques.",
    rounds = when(level) {
        "Beginner" -> 3
        "Advanced" -> 3
        "Professional" -> 3
        "Demo" -> 2
        else -> 1 //Default-Wert
    },
    duration = when(level) {
        "Beginner" -> 60
        "Advanced" -> 120
        "Professional" -> 180
        "Demo" -> 10
        else -> 120 //Default-Wert
    },
    pause = when(level) {
        "Beginner" -> 60
        "Advanced" -> 60
        "Professional" -> 30
        "Demo" -> 5
        else -> 5 //Default-Wert
    },
    level = level,
    nextExercise = when(level) {
        "Beginner" -> 60
        "Advanced" -> 60
        "Professional" -> 60
        "Demo" -> 10
        else -> 60 //Default-Wert
    }
)