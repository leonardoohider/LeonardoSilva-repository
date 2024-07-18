package com.example.exerciciomod04

class Lista_Numb {
}
fun main(){
    val numeros = (1..99).toList()
    val numerosPares = numeros.filter { it % 2 == 0}
    println(numerosPares)
}