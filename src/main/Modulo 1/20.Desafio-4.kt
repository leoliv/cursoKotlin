fun main() {
    print("Digite um dia da semana: ")
    val dia = readln().uppercase()
    when (dia) {
        "SAB", "DOM" -> {
            println("Fim de semana!")
        }
        "SEG", "TER", "QUA", "QUI", "SEX" -> {
            println("Dia útil")
        }
        else -> println("Error!")
    }
}