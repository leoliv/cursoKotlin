fun main() {
    // ( &&, ||, )
    print("Digite o preço: ")
    val entrada = readln()
    val preco = entrada.toInt()
    print("Digite o nome do produto: ")
    val produto = readln()
    if (preco == 49 || produto == "Teclado") println("Sucesso!")
    else println("Falha!")
}