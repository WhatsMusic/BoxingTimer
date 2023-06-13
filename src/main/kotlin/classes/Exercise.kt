open class Exercise(
    var exerciseName: String,
    var exerciseDescription: String,
    var exerciseRounds: Int,
    var exerciseDuration: Int,
    var exercisePause: Int,
    var exerciseLevel: String
) {
    fun setName(exerciseName: String) {
        this.exerciseName = exerciseName
    }

    fun setDescription(exerciseDescription: String) {
        this.exerciseDescription = exerciseDescription
    }

    fun setRounds(exerciseRounds: Int) {
        this.exerciseRounds = exerciseRounds
    }

    fun setDuration(exerciseDuration: Int) {
        this.exerciseDuration = exerciseDuration
    }

    fun setPause(exercisePause: Int) {
        this.exercisePause = exercisePause
    }

    fun setLevel(exerciseLevel: String) {
        this.exerciseLevel = exerciseLevel
    }
}