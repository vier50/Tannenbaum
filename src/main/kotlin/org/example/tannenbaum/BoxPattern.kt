package org.example.tannenbaum

class BoxPattern : Pattern(3, "Box") {

    private var width = 5
    private var height = 3
    private var char = '*'
    private var filled = false

    override fun init(): Pattern {
        print("Width of the box: ")
        width = readLine()?.toIntOrNull() ?: width
        print("Height of the box: ")
        height = readLine()?.toIntOrNull() ?: height
        print("Char to print: ")
        char = readLine()?.firstOrNull() ?: char
        print("Fill the box [true/false]: ")
        filled = readLine()?.toBoolean() ?: filled
        return this
    }

    override fun draw() {
        println(char * width)
        for (i in 1..(height - 2)) {
            if (filled) {
                println(char * width)
            } else {
                println("*${' ' * (width - 2)}*")
            }
        }
        println(char * width)
    }
}
