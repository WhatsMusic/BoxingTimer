import java.util.Scanner
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