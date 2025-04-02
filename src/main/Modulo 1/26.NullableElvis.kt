fun main() {
    // Variável que aceita Null  (Nullable)
    var produto: String? = "iMac"

/*
    if (produto != null) {
        val qtdcaracteres = produto.length
        println(qtdcaracteres)
    } else {
        println("Valor Null")
    }
*/
//    val qtdcaracteres = if (produto != null) produto.length else 0
//    val qtdcaracteres = produto?.length

    // Operador Elvis ?:
    val qtdcaracteres = produto?.length ?: 0


    println(qtdcaracteres)
}