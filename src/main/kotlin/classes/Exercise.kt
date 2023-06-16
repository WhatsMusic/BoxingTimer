val exercises: MutableList<Exercise> = mutableListOf<Exercise>()
open class Exercise(
    var name: String,
    var description: String,
    var rounds: Int,
    var duration: Int,
    var pause: Int,
    var level: String
)
    fun setExercises(){
        exercises.add(warmUp)
        exercises.add(ropeSkipping)
        exercises.add(shadowBoxing)
        exercises.add(sparring)
        exercises.add(coolDown)
    }

    // Erstellen einer spezifischen Klasse für RopeSkipping
    class RopeSkipping(level: String) : Exercise(
        name = "Rope-Skipping",
        description = "Rope Skipping routines are crucial for enhancing speed, agility, and cardio endurance. These high-intensity bursts help replicate the stop-and-start nature of boxing, while also improving footwork, a key component for effective in-ring movement. The combination of endurance, coordination, and timing development makes rope skipping an integral part of any boxing regimen.",
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
        level = level
    )

    // Erstellen einer spezifischen Klasse für ShadowBoxing
    class ShadowBoxing(level: String) : Exercise(
        name = "Shadow-Boxing",
        description = "Shadow boxing focuses on the execution of movements and the perfection of techniques. Practiced often in front of a mirror, boxers can self-critique and improve their punches, footwork, and defensive maneuvers without the pressure of an opponent. This drill develops muscle memory, enhances speed and precision, and helps internalize effective boxing strategies.",
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
        level = level
    )

    // Erstellen einer spezifischen Klasse für Sparring
    class Sparring(level: String) : Exercise(
        name = "Sparring",
        description = "Sparring is a practical, controlled application of boxing techniques against an opponent, often under the supervision of a coach. This session allows boxers to test their skills, strategy, and stamina in a setting that closely simulates a real fight. By experiencing offensive and defensive scenarios, participants refine their timing, precision, and reactions, making sparring an invaluable tool for improving ring craft and building confidence.",
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
        level = level
    )

    // Erstellung der Objekte
    val warmUp = Exercise(
        name = "Warm-Up",
        description = "The 5-minute warm-up is essential to prepare the body for the intensity of boxing. It consists of light exercises such as jogging, stretching, or bodyweight movements, which gradually increase the heart rate, loosen the joints, and warm up the muscles, reducing the risk of injury during subsequent high-intensity training. This preparatory phase also mentally gears up the participant for the rigorous workout ahead.",
        rounds = 1,
        duration = 15,
        pause = 5,
        level = selectedLevel
    )
    val ropeSkipping = RopeSkipping(selectedLevel)
    val shadowBoxing = ShadowBoxing(selectedLevel)
    val sparring = Sparring(selectedLevel)
    val coolDown = Exercise(
    name = "Cool-Down",
    description = "The cool-down phase is the final stage of a boxing training session, aimed at gradually reducing the heart rate and relaxing the muscles. This typically includes slow-paced exercises like walking, light stretching, or yoga poses, which help in preventing muscle stiffness, improving flexibility, and aiding in the recovery process. The cool-down phase also serves as a time for mental relaxation, allowing trainees to reflect on their performance during the session.",
    rounds = 1,
    duration = 20,
    pause = 0,
    level = selectedLevel
)


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





