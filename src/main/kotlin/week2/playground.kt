package week2


fun Char.isValid() = this in 'A'..'Z' || this in 'a'..'z' || this in '0'..'9' || this == '_'
fun Char.isValidInFirstPosition() = this in 'A'..'Z' || this in 'a'..'z' || this == '_'

fun isValidIdentifier(s: String): Boolean {
    return !s.isEmpty() && s.first().isValidInFirstPosition() && s.all { it.isValid() }
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}