/*
Crie um programa que possa imprimir o seu nome, idade, primeira letra do nome, altura, peso e se é programador.

A saída deve ser algo como o meu exemplo abaixo:

Tiago Aguiar
34
T
1.69
70
true
 */
fun main() {

    val name: String = "Leonardo Fernandes"
    val age: Short = 29
    val firstLetterName: Char = 'L'
    val height: Float = 1.65F
    val weight: Int = 50
    val isDev: Boolean = true

    println("Nome: $name")
    println("Idade: $age")
    println("Primeira letra Nome: $firstLetterName")
    println("Altura: $height")
    println("Peso: $weight")
    println("É Programador?: $isDev")
}