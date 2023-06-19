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

//Gibt den Inhalt eines Strings bold aus (erstellt mit ChatGPT)
fun String.toBold(): String = "\u001B[1m$this\u001B[0m"

