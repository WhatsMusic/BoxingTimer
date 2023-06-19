package classes.exercises
import classes.BoxingTimer
import classes.Exercise

// Create a specific class for RopeSkipping
class RopeSkipping(level: String) : Exercise(
    name = "Rope-Skipping",
    description = "Rope Skipping routines are crucial for enhancing speed, agility, and cardio endurance.",
    rounds = when(BoxingTimer.selectedLevel) {
        "Beginner" -> 3
        "Advanced" -> 3
        "Professional" -> 3
        "Demo" -> 2
        else -> 1 //Default-Wert
    },
    duration = when(BoxingTimer.selectedLevel) {
        "Beginner" -> 60
        "Advanced" -> 90
        "Professional" -> 180
        "Demo" -> 10
        else -> 10 //Default-Wert
    },
    pause = when(BoxingTimer.selectedLevel) {
        "Beginner" -> 60
        "Advanced" -> 60
        "Professional" -> 60
        "Demo" -> 5
        else -> 5 //Default-Wert
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