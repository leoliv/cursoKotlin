/*
Crie um programa que contenha um número inteiro e um texto que representa um número.
Seu objetivo é somar esses dois valores, mas você precisará converter os tipos corretamente
 antes de realizar a operação.

A variável de resposta deve ter o valor: 45
 */

fun main() {
    val numero = 22.5
    val texto = "22.5"
    val textoDou = texto.toDouble()

    val soma = numero + textoDou
    val resposta = soma.toInt()
    println(resposta)
}