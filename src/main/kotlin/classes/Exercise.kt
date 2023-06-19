val exercises: MutableList<Exercise> = mutableListOf<Exercise>()
open class Exercise(
    var name: String,
    var description: String,
    var rounds: Int,
    var duration: Int,
    var pause: Int,
    var level: String,
    var nextExercise: Int
)
    fun setExercises(){
        exercises.add(warmUp)
        exercises.add(ropeSkipping)
        exercises.add(shadowBoxing)
        exercises.add(sparring)
        exercises.add(coolDown)
    }


    // Erstellen einer spezifischen Klasse für Warm-Up
    class WarmUp(level: String) : Exercise(
        name = "Warm-Up",
        description = "The 5-minute warm-up is essential to prepare the body for the intensity of boxing.",
        rounds = when(level) {
            "beginner" -> 1
            "advanced" -> 1
            "professional" -> 1
            "demo" -> 1
            else -> 1 //Default-Wert
        },
        duration = when(level) {
            "beginner" -> 300
            "advanced" -> 300
            "professional" -> 300
            "demo" -> 10
            else -> 10 //Default-Wert
        },
        pause = when(level) {
            "beginner" -> 0
            "advanced" -> 0
            "professional" -> 0
            "demo" -> 0
            else -> 0 //Default-Wert
        },
        level = selectedLevel,
        nextExercise = when(level) {
            "beginner" -> 60
            "advanced" -> 60
            "professional" -> 60
            "demo" -> 10
            else -> 60 //Default-Wert
        }
    )


    // Erstellen einer spezifischen Klasse für RopeSkipping
    class RopeSkipping(level: String) : Exercise(
        name = "Rope-Skipping",
        description = "Rope Skipping routines are crucial for enhancing speed, agility, and cardio endurance.",
        rounds = when(level) {
            "beginner" -> 3
            "advanced" -> 3
            "professional" -> 3
            "demo" -> 2
            else -> 1 //Default-Wert
        },
        duration = when(level) {
            "beginner" -> 60
            "advanced" -> 90
            "professional" -> 180
            "demo" -> 10
            else -> 10 //Default-Wert
        },
        pause = when(level) {
            "beginner" -> 60
            "advanced" -> 60
            "professional" -> 60
            "demo" -> 5
            else -> 5 //Default-Wert
        },
        level = level,
        nextExercise = when(level) {
            "beginner" -> 60
            "advanced" -> 60
            "professional" -> 60
            "demo" -> 10
            else -> 60 //Default-Wert
        }
    )

    // Erstellen einer spezifischen Klasse für ShadowBoxing
    class ShadowBoxing(level: String) : Exercise(
        name = "Shadow-Boxing",
        description = "Shadow boxing focuses on the execution of movements and the perfection of techniques.",
        rounds = when(level) {
            "beginner" -> 3
            "advanced" -> 3
            "professional" -> 3
            "demo" -> 2
            else -> 1 //Default-Wert
        },
        duration = when(level) {
            "beginner" -> 60
            "advanced" -> 120
            "professional" -> 180
            "demo" -> 10
            else -> 120 //Default-Wert
        },
        pause = when(level) {
            "beginner" -> 60
            "advanced" -> 60
            "professional" -> 30
            "demo" -> 5
            else -> 5 //Default-Wert
        },
        level = level,
        nextExercise = when(level) {
            "beginner" -> 60
            "advanced" -> 60
            "professional" -> 60
            "demo" -> 10
            else -> 60 //Default-Wert
        }
    )

    // Erstellen einer spezifischen Klasse für Sparring
    class Sparring(level: String) : Exercise(
        name = "Sparring",
        description = "Sparring is a practical, controlled application of boxing techniques against an opponent, often under the supervision of a coach.",
        rounds = when(level) {
            "beginner" -> 3
            "advanced" -> 5
            "professional" -> 6
            "demo" -> 2
            else -> 1 //Default-Wert
        },
        duration = when(level) {
            "beginner" -> 180
            "advanced" -> 180
            "professional" -> 180
            "demo" -> 15
            else -> 10 //Default-Wert
        },
        pause = when(level) {
            "beginner" -> 60
            "advanced" -> 60
            "professional" -> 60
            "demo" -> 5
            else -> 10 //Default-Wert
        },
        level = level,
        nextExercise = when(level) {
            "beginner" -> 60
            "advanced" -> 60
            "professional" -> 60
            "demo" -> 10
            else -> 60 //Default-Wert
        }
    )


    // Erstellen einer spezifischen Klasse für Cool-Down
    class CoolDown(level: String) : Exercise(
        name = "Cool-Down",
        description = "The cool-down phase is the final stage of a boxing training session, aimed at gradually reducing the heart rate and relaxing the muscles.",
        rounds = when(level) {
            "beginner" -> 1
            "advanced" -> 1
            "professional" -> 1
            "demo" -> 1
            else -> 1 //Default-Wert
        },
        duration = when(level) {
            "beginner" -> 600
            "advanced" -> 600
            "professional" -> 600
            "demo" -> 10
            else -> 10 //Default-Wert
        },
        pause = when(level) {
            "beginner" -> 0
            "advanced" -> 0
            "professional" -> 0
            "demo" -> 0
            else -> 0 //Default-Wert
        },
        level = selectedLevel,
        nextExercise = 0
    )



    // Erstellung der Objekte
    val warmUp = WarmUp(selectedLevel)
    val ropeSkipping = RopeSkipping(selectedLevel)
    val shadowBoxing = ShadowBoxing(selectedLevel)
    val sparring = Sparring(selectedLevel)
    val coolDown = CoolDown(selectedLevel)



    /* Methoden sind Bonus

    fun setExerciseName(name: String) {
        this.name = name
    }

    fun setExerciseDescription(description: String) {
        this.description = description
    }

    fun setExerciseRounds(rounds: Int) {
        this.rounds = rounds
    }

    fun setExerciseDuration(duration: Int) {
        this.duration = duration
    }

    fun setExercisePause(pause: Int) {
        this.pause = pause
    }

    fun setExerciseLevel(level: String) {
        this.level = level
    }
     */





