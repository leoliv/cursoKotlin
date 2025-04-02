/*
Crie um programa que possa imprimir a quantidade de caracteres do seu nome e também qual será a sua idade no ano 2050.

Exemplo de mensagem:

Olá Tiago. Em 2050 você terá 60 anos. Seu nome possui 5 caracteres.
 */
fun main() {
    val name: String = "Leonardo"
    val dataNasc = 1995
    val ano = 2050
    println("Olá $name. Em $ano você terá ${ano - dataNasc} anos. Seu nome possui ${name.length} caracteres.")
}