import classes.BoxingTimer.Companion.boxingTimerMenu
import classes.BoxingTimer.Companion.setLevel
import classes.Exercise.Companion.setExercises


fun main(){
    //Some ascii artwork with project domain as heading.
    println("""             
        (ง •̀!•́)ง ผ(•̀¿•́ผ)
        BOXING-TIMER.COM
    """.trimIndent())

    // User query by difficulty level
    setLevel()

    //creates the exercises depending on the difficulty level
    setExercises()

    //Menu to display an overview of the individual exercises in the selected training plan.
    //or start the training
    boxingTimerMenu()

}


