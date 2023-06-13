class MedBallDrill : Exercise {
    constructor(
        name: String,
        description: String,
        rounds: Int,
        duration: Int,
        pause: Int,
        level: String,
        medballWeight: Int
    ) : super(name, description, rounds, duration, pause, level)

    private var medballWeight: Int = 0

    fun setMedballWeight(medballWeight: Int) {
        this.medballWeight = medballWeight
    }
}