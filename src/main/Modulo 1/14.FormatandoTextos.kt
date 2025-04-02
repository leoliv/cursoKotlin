fun main() {
    // Formatando textos

    // 1.
    val msg = "Olá, Leonardo. \nSeu produto chegou!"
    /*println(msg)*/

    // 2.
    val welcome = """
        Olá, Leonardo
        Bem vindo ao seu Sistema de Acesso do Curso!
        Apartir de agora, você é um membro dos Programadores.
    """.trimIndent()
    /*println(welcome)*/

    val csv = """
        Texto 1,
        Texto 2
    """.replaceIndent(newIndent = ";")
    println(csv)

    // 3.
    val name = "Leonardo"
    val age = 29
    val price = 19.81

    println("Olá, $name. Como você tem a idade de $age. Você pode pagar apenas R$${price + 1}.")
}