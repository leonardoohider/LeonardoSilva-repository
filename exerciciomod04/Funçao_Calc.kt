package com.example.exerciciomod04

class Funçao_Calc {
}
fun calculadora(Numero1: Int, Numero2: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(Numero1, Numero2)
}
fun soma(numerodaSoma1: Int, numerodaSoma2 : Int): Int {
    return numerodaSoma1 + numerodaSoma2
}
fun multiplicacao(numeroMult1: Int, numeroMult2: Int): Int {
    return numeroMult1 * numeroMult2
}
    fun main() {
        val num1 = 10
        val num2 = 5
        val resultadosoma = calculadora(num1, num2, ::soma)
        println("A Soma de $num1 e $num2 é $resultadosoma")

        val resultadomult = calculadora(num1, num2, ::multiplicacao)
        println("A Multiplicaçao de $num1 e $num2 é $resultadomult")
    }
