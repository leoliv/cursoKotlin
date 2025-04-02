fun main() {
    val texto = "10"
    val respostaToInt = texto.toInt()
    println(respostaToInt)
    println(respostaToInt::class)

    val numero = 10
    val respostaToString = numero.toString()
    println(respostaToString)
    println(respostaToString::class)
}