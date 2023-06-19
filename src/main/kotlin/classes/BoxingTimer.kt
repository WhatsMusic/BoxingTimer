package classes
import Exercise.Companion.listExercises
import TrainingPlan
import TrainingPlan.Companion.showTrainingPlan
import TrainingPlan.Companion.startTraining

enum class Level {
        Beginner, Advanced, Professional, Demo
}

open class BoxingTimer(var trainingPlans: MutableList<TrainingPlan>) {

        companion object {

                var selectedLevel = ""

                fun setLevel() {
                        println("\nSelect the level of your training:\n\n" +
                                "[1] for ${Level.Beginner.toString()}\n" +
                                "[2] for ${Level.Advanced.toString()}\n" +
                                "[3] for ${Level.Professional.toString()}\n" +
                                "[4] for ${Level.Demo.toString()}\n" +
                                "Type the number: ")
                        val selectLevel = readln()?.toInt()

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
                        var menuItem = readln().toInt()
                        when(menuItem) {
                                1 -> listExercises() //Listet alle Übungen aus dem Trainingsplan auf
                                2 -> {
                                        showTrainingPlan() //Zeigt den Trainingsplan}
                                        startTraining() //startet das Training
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










