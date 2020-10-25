package org.example.tannenbaum

import kotlin.system.exitProcess

fun main() {
    val patterns = mutableListOf<Pattern>()
    patterns.add(LeftShiftPyramidPattern())
    patterns.add(RightShiftPyramidPattern())

    while (true) {
        println("[0] Exit")
        for (pattern in patterns) {
            println("[${pattern.id}] ${pattern.name}")
        }
        println("[invalid] Reload")

        print("Choose a pattern to print: ")
        val id = readLine()?.toIntOrNull() ?: continue

        if (id == 0) {
            exitProcess(0)
        }

        println("-".repeat(64))
        patterns.firstOrNull { it.id == id }?.init()?.draw()
        println("-".repeat(64))
    }
}