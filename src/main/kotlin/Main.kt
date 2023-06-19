
import Exercise.Companion.setExercises
import classes.BoxingTimer.Companion.boxingTimerMenu
import classes.BoxingTimer.Companion.setLevel
var nextExercise = Int

fun main(){
    //Some Ascii Art with Project Domain as Header
    println("""        
             
        (ง •̀!•́)ง ผ(•̀¿•́ผ)
        BOXING-TIMER.COM        
    """.trimIndent())


    // Rufe setLevel Methode auf der Instanz auf
    setLevel()

    //erstellt die Übungen
    setExercises()

    // Rufe boxingTimerMenu Methode auf der Instanz auf
    boxingTimerMenu()




}


