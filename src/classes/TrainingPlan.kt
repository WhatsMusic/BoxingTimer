open class TrainingPlan(val exercises: MutableList<Exercise>) {

    fun addExercise(exercise: Exercise) {
        exercises.add(exercise)
    }

    fun delExercise(exercise: Exercise) {
        exercises.remove(exercise)
    }

    fun startPlan() {
        //TODO: Logik, um den Timer zu starten und die Konsole entsprechend zu aktualisieren
    }
}

