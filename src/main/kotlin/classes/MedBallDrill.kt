class MedBallDrill(
    name: String,
    description: String,
    rounds: Int,
    duration: Int,
    pause: Int,
    level: String,
    private var medballWeight: Int
) : Exercise(name, description, rounds, duration, pause, level) {
    fun setMedballWeight(medballWeight: Int) {
        this.medballWeight = medballWeight
    }
}