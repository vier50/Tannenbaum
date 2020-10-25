package org.example.tannenbaum

class LeftShiftPyramidPattern : Pattern(1, "Left Shift Pyramid") {

    private var lines = 3
    private var char = '*'

    override fun init(): Pattern {
        print("Number of lines: ")
        lines = readLine()?.toIntOrNull() ?: lines
        print("Char to print: ")
        char = readLine()?.firstOrNull() ?: char
        return this
    }

    override fun draw() {
        for (i in 1..lines) {
            println(char * i)
        }
    }
}