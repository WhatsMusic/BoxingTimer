import classes.BoxingTimer



fun main(){

    println("""        
             
        (ง •̀!•́)ง ผ(•̀¿•́ผ)
        BOXING-TIMER.COM        
    """.trimIndent())
    //erwartet Auswahl des Schwierigkeitsgrads
    setLevel()

    //erstellt die Übungen
    setExercises()

    //Zeigt den Trainingsplan
    showTrainingPlan()

    //Listet alle Übungen aus dem Trainingsplan auf
    //ListExercises()

    //startet das Training
    BoxingTimer.startBoxingTimer()

}


