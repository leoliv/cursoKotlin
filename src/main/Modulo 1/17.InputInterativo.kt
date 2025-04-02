fun main() {
    print("Digite seu nome: ")
    val nome = readln() // Entrada de dados vai ser String
    if (nome == "José") println("Bem vindo, $nome")
    else println("Não te conheço!")

    val entrada = readln()
    val numero = entrada.toInt()
    println(numero)
}