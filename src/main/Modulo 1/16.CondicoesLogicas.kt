fun main() {
    val produto = "iPhone"
    // ( <, <=, >, >=, !, ==, != )
    if (produto.length < 3) {
        println("Você não pode cadastrar produtos com menos de 3 letras.")
    } else {
        println("Produto cadastrado com sucesso!")
    }

    val bonusDinheiro = 2_000
    if (bonusDinheiro >= 30_000) {
        println("Você ganhou 30% de Desconto!")
    } else if (bonusDinheiro >= 20_000) {
        println("Você ganhou 20% de Desconto!")
    } else if (bonusDinheiro >= 10_000) {
        println("Você ganhou 10% de Desconto!")
    } else {
        println("Você não ganhou nenhum desconto!")
    }
}