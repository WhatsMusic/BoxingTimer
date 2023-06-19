package classes
import classes.BoxingTimer.Companion.boxingTimerMenu
import classes.exercises.*
import toBold
import wrapString
val exercises = mutableListOf<Exercise>()

open class Exercise(
    var name: String,
    var description: String,
    var rounds: Int,
    var duration: Int,
    var pause: Int,
    var level: String,
    var nextExercise: Int
) {


    companion object {


        fun setExercises() {
            exercises.add(warmUp)
            exercises.add(ropeSkipping)
            exercises.add(shadowBoxing)
            exercises.add(sparring)
            exercises.add(coolDown)
        }
        //Listet alle Übungen auf
        fun listExercises(){

            println("\n-----Exercise Overview-----\n".toBold())

            for (i in exercises.indices)
            {
                println("${i+1}. Exercise: ${exercises[i].name}\n".toBold() +
                        "Level:".toBold() + " ${exercises[i].level}\n" +
                        "Description:".toBold() +
                        "${wrapString(exercises[i].description,80)}\n" +
                        "Rounds:".toBold() + "  ${exercises[i].rounds}x\n" +
                        "Duration:".toBold() + "  ${exercises[i].duration}sec\n" +
                        "Break:".toBold() + "  ${exercises[i].pause}sec\n\n".trimMargin())
            }

            boxingTimerMenu()


        }
    }
}



// Erstellung der Objekte
    val warmUp = WarmUp(BoxingTimer.selectedLevel)
    val ropeSkipping = RopeSkipping(BoxingTimer.selectedLevel)
    val shadowBoxing = ShadowBoxing(BoxingTimer.selectedLevel)
    val sparring = Sparring(BoxingTimer.selectedLevel)
    val coolDown = CoolDown(BoxingTimer.selectedLevel)



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





