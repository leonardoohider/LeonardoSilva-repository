package com.leonardohider.exercciomdulo3

class arrays_Int {
}

fun main() {
    // Criando um array de inteiros de tamanho 40
    val arrayInteiros = IntArray(40)

    // Populando o array com números de 1 a 39 usando um loop for
    for (i in 0 until 40) {
        arrayInteiros[i] = i + 1
    }

    // Imprimindo alguns elementos do array
    println("Array[0]: ${arrayInteiros[0]}")
    println("Array[10]: ${arrayInteiros[10]}")
    println("Array[39]: ${arrayInteiros[39]}")
}