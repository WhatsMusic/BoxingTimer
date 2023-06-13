class TrainingPlan(
    private var trainingPlanName: String,
    private var trainingPlanExercises: MutableList<Exercise>,
    var totalDuration: Int,
    var numExercises: Int,
    private var trainingPlanLevel: String
) {
    fun setName(trainingPlanName: String) {
        this.trainingPlanName = trainingPlanName
    }

    fun addExercise(trainingPlanExercises: Exercise) {
        this.trainingPlanExercises.add(trainingPlanExercises)
    }

    fun delExercise(trainingPlanExercises: Exercise) {
        this.trainingPlanExercises.remove(trainingPlanExercises)
    }

    fun startPlan() {
        //TODO: Logik um die Übungen in einer Schleife zu durchlaufen und für jede Übung einen Timer zu starten
    }

    fun calcTotalDuration() {
        //TODO: Logik zur Berechnung der Gesamtdauer des Trainingsplan
    }

    fun calcNumExercises() {
        //TODO: Logik zur Berechnung der Anzahl der Übungen im Trainingsplan
    }

    fun setLevel(trainingPlanLevel: String) {
        this.trainingPlanLevel = trainingPlanLevel
    }

    fun filterLevel() {
        //TODO: Logik zum Filtern der Übungen nach Schwierigkeitsgrad
    }
}