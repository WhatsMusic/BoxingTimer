open class Exercise(
    var name: String,
    var description: String,
    var rounds: Int,
    var duration: Int,
    var pause: Int,
    var level: String
) {
    fun setName(name: String) {
        this.name = name
    }

    fun setDescription(description: String) {
        this.description = description
    }

    fun setRounds(rounds: Int) {
        this.rounds = rounds
    }

    fun setDuration(duration: Int) {
        this.duration = duration
    }

    fun setPause(pause: Int) {
        this.pause = pause
    }

    fun setLevel(level: String) {
        this.level = level
    }
}