package com.example.exerciciomod04

class List_Names {
}
fun main(){
    val nomes = listOf("Leonardo","Monike","Alyce","Joao")
    val saud = nomes.map { "Ola $it" }

    saud.forEach{ println(it) }
}