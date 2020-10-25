package org.example.tannenbaum

fun main() {
    val patterns = mutableListOf<Pattern>()
    patterns.add(LeftShiftPyramidPattern())

    while (true) {
        println("[0] Reload")
        for (pattern in patterns) {
            println("[${pattern.id}] ${pattern.name}")
        }
        println("[invalid] Reload")

        print("Choose a pattern to print: ")
        val id = readLine()?.toIntOrNull() ?: 0

        println("-".repeat(64))
        patterns.firstOrNull { it.id == id }?.init()?.draw()
        println("-".repeat(64))
    }
}