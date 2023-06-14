val exercises = mutableListOf<Exercise>()
val levels: List<String> = listOf<String>("beginner", "advanced", "professional")
open class Exercise(
    var name: String,
    var description: String,
    var rounds: Int,
    var duration: Int,
    var pause: Int,
    var level: String
) {

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
        this.level = levels.toString()
    }
}

//Erstelle Übungen und füge diese der mutablen Liste exercises zu

//TODO: add setExercises to Klassendiagramm update Project Description
fun setExercises(){
    exercises.add(warmUp)
    exercises.add(ropeSkipping)
}



val ropeSkipping = Exercise(
    name = "Rope Skipping",
    description = "Rope Skipping routines are crucial for enhancing speed, agility, and cardio endurance.",
    rounds = 3,
    duration = 180,
    pause = 30,
    level = levels[1]
)

val warmUp = Exercise(
    name = "warmUp",
    description = "The 5-minute warm-up is essential to prepare the body for the intensity of boxing. It consists of light exercises such as jogging, stretching, or bodyweight movements, which gradually increase the heart rate, loosen the joints, and warm up the muscles, reducing the risk of injury during subsequent high-intensity training. This preparatory phase also mentally gears up the participant for the rigorous workout ahead.",
    rounds = 1,
    duration = 300,
    pause = 0,
    level = levels.toString()
)

