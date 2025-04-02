/*
Crie um programa que simula o cadastro de um usuário,
onde o nome do usuário pode ser opcional (nullable).
O desafio é garantir que o nome do usuário sempre apresente um texto,
e se for nulo, deve ser substituído por uma string padrão como
"Usuário Desconhecido" usando o operador Elvis.


A saída deve ser como: Bem-vindo(a), Steve Jobs! OU

A saída deve ser como: Bem-vindo(a), usuário Desconhecido!
 */

fun main() {
    println("======================")
    println(" CADASTRO DE USUÁRIO")
    println("======================")
    val nomeUsuario: String? = "Leo"
    println("Bem-vindo(a), ${nomeUsuario ?: "Usuário Desconhecido!"}!")

}
