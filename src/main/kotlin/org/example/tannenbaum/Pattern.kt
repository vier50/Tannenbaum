package org.example.tannenbaum

abstract class Pattern(val id: Int, val name: String) {

    protected operator fun Char.times(n: Int) = this.toString().repeat(n)

    protected operator fun String.times(n: Int) = this.repeat(n)

    abstract fun init(): Pattern

    abstract fun draw()
}