fun main() {
    val mediaDePrecoToDouble = 22
    val respostaToDouble = mediaDePrecoToDouble.toDouble()
    println("Media para Double $respostaToDouble")
    println(respostaToDouble::class)

    val mediaDePrecoToInt = 22.22
    val respostaToInt = mediaDePrecoToInt.toInt()
    println("Media para Int $respostaToInt")
    println(respostaToInt::class)
}