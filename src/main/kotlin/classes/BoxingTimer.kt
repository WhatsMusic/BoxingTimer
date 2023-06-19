package classes
import classes.Exercise.Companion.listExercises
import classes.TrainingPlan.Companion.showTrainingPlan
import classes.TrainingPlan.Companion.startTraining

enum class Level {
        Beginner, Advanced, Professional, Demo
}

open class BoxingTimer {

        companion object {

                var selectedLevel = ""

                fun setLevel() {
                        println("\nSelect the level of your training:\n\n" +
                                "[1] for ${Level.Beginner}\n" +
                                "[2] for ${Level.Advanced}\n" +
                                "[3] for ${Level.Professional}\n" +
                                "[4] for ${Level.Demo}\n" +
                                "Type the number: ")
                        val selectLevel = readln().toInt()

                        selectedLevel = when(selectLevel) {
                                1 -> Level.Beginner.toString()
                                2 -> Level.Advanced.toString()
                                3 -> Level.Professional.toString()
                                4 -> Level.Demo.toString()
                                else -> {
                                        println("Wrong input! Only type 1, 2, 3 or 4")
                                        setLevel()
                                        return
                                }
                        }
                }

                fun boxingTimerMenu() {
println(
        """
        What would you like to do?
        [1] $selectedLevel exercises overview?
        [2] Start your $selectedLevel Boxing Training?
        
        Type 1 for overview or 2 to start the Boxing Training!
        """.trimMargin()
        )
                        when(readln().toInt()) {
                                1 -> listExercises() //Lists all exercises from the training plan
                                2 -> {
                                        showTrainingPlan() //Shows the training plan
                                        startTraining() //starts the training
                                }

                                else -> {
                                        println("wrong input")
                                        boxingTimerMenu()
                                        return
                                }
                        }

                }
        }

}










