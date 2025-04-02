fun main() {
    print("Insira o ID do produto: ")
    val produto = readln().toInt()

    when (produto) {
        1, 3 -> {
            println("Você ganhou 10% de desconto!")
        }
        2 -> {
            println("Você ganhou 20% de desconto!")
        }
        else -> {
            println("Compra aprovada!")
        }
    }
}