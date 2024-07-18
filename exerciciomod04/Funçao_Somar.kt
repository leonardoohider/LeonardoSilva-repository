package com.example.exerciciomod04

class Funçao_Somar {
}
fun somar(Number1: Int, Number2: Int): Int {
    return Number1 + Number2
}

fun main() {
    val num1 = 300
    val num2 = 500
    val resultado = somar(num1, num2)
    println("A soma de $num1 + $num2 = $resultado")
}

