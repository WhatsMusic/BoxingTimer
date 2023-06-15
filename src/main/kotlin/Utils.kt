import kotlin.concurrent.thread
import kotlin.system.exitProcess
var selectedLevel = ""

fun printLevel() {
    println("Your selected level is $selectedLevel")
}
fun setLevel() {
    println("\nSelect the level of your training:\n\n" +
            "[1] for Beginner\n" +
            "[2] for Advanced\n" +
            "[3] for Professional\n" +
            "Type the number: ")
    val selectLevel = readln()?.toInt()

    selectedLevel = when(selectLevel) {
        1 -> "beginner"
        2 -> "advanced"
        3 -> "professional"
        else -> {
            println("Wrong input! Only type 1, 2 or 3")
            setLevel()
            return
        }
    }
}

fun countdown(timeInSeconds: Int) {
    var timeRemaining = timeInSeconds

    thread(start = true) {
        while (timeRemaining >= 0) {
            print("\rVerbleibende Zeit: $timeRemaining Sekunden") // Verwendet '\r', um den Cursor an den Anfang der Zeile zu verschieben
            Thread.sleep(1000)  // Warte für 1 Sekunde
            timeRemaining--
        }
        println(" Der Timer ist abgelaufen.")
        exitProcess(0)  // Beendet das Programm, wenn der Timer abgelaufen ist
    }
}

//Erwartet Zeit in Sekunden und startet Countdown
fun startCountdown(){
    println("Bitte geben Sie die Zeit in Sekunden ein:")
    val timeInSeconds = readln().toInt()
    countdown(timeInSeconds)
}

//TODO: repeat(exercises.rounds) verwenden

//TODO: exercises.sumOf um die Gesamtzeit zu kalkulieren { exercise -> exercise.duration }

//Listet alle Übungen auf
fun listExercises(){

    println("\n-----Exercise Overview-----\n".toBold())

    for (i in exercises.indices)
        {
            println("${i+1}. Exercise: ${exercises[i].name}\n".toBold() +
                    "Level:".toBold() + " ${exercises[i].level}\n" +
                    "Description:".toBold() +
                    "${wrapString(exercises[i].description,80)}\n" +
                    "Rounds:".toBold() + "  ${exercises[i].rounds}x\n" +
                    "Duration:".toBold() + "  ${exercises[i].duration}sec\n" +
                    "Break:".toBold() + "  ${exercises[i].pause}sec\n\n".trimMargin())
        }
}

//Bricht die Zeile bei Ausgabe von langen Strings in der Konsole (erstellt mit ChatGPT)
fun wrapString(str: String, lineWidth: Int): String {
    val lines = mutableListOf<String>()
    var line = StringBuilder()
    str.split(' ').forEach { word ->
        if (line.length + word.length + 1 > lineWidth) {
            lines.add(line.toString())
            line = StringBuilder()
        }
        if (line.isNotEmpty()) {
            line.append(' ')
        }
        line.append(word)
    }
    lines.add(line.toString())
    return lines.joinToString("\n")
}

//Gibt den Inhalt des Strings bold aus (erstellt mit ChatGPT)
fun String.toBold(): String = "\u001B[1m$this\u001B[0m"