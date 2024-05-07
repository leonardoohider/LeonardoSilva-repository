package com.leonardohider.exercciomdulo3

class condicionais_when {
}
fun main() {
    // Variável par
    val par = 10

    // Verificando se o número é par usando o operador when
    when (par) {
        0, 2, 4, 6, 8, 10 -> println("O número $par é par")
        else -> println("O número $par é ímpar")
    }
}