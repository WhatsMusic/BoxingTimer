class TrainingPlan(
    var name: String,
    var exercises: MutableList<Exercise>,
    var totalDuration: Int,
    var numExercises: Int,
    var level: String
) {
    fun setName(name: String) {
        this.name = name
    }

    fun addExercise(exercise: Exercise) {
        this.exercises.add(exercise)
    }

    fun delExercise(exercise: Exercise) {
        this.exercises.remove(exercise)
    }

    fun startPlan() {
        //TODO: Logik um die Übungen in einer Schleife zu durchlaufen und für jede Übung einen Timer zu starten
    }

    fun calcTotalDuration() {
        //TODO: Logik zur Berechnung der Gesamtdauer des Ausbildungsplans
    }

    fun calcNumExercises() {
        //TODO: Logik zur Berechnung der Anzahl der Übungen im Trainingsplan
    }

    fun setLevel(level: String) {
        this.level = level
    }

    fun filterLevel() {
        //TODO: Logik zum Filtern der Übungen nach Schwierigkeitsgrad
    }
}