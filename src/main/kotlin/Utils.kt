import kotlin.concurrent.thread
import kotlin.system.exitProcess

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


//Listet alle Übungen auf
fun listExercises(){

    println("\n-----Exercise Overview-----\n".toBold())

    var i = 0
    while(i < exercises.size)
        {
            println("Exercise: ${exercises[i].name}\n".toBold() +
                    "Level:".toBold() + " ${exercises[i].level}\n" +
                    "Description:".toBold() +
                    "${wrapString(exercises[i].description,80)}\n" +
                    "Rounds:".toBold() + "  ${exercises[i].rounds}\n" +
                    "Duration:".toBold() + "  ${exercises[i].duration}\n" +
                    "Break:".toBold() + "  ${exercises[i].pause}\n\n".trimMargin())
            i++
        }
}

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

        fun String.toBold(): String = "\u001B[1m$this\u001B[0m"