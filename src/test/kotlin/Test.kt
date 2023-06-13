import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Bitte geben Sie die Zeit in Sekunden ein:")
    val timeInSeconds = scanner.nextInt()

    countdown(timeInSeconds)
}