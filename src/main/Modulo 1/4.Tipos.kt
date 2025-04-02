fun main() {

    // ESPACOS DE MEMORIA EM TIPOS PRIMITIVOS

    val desconto: Float = 32.55f // 32-bit
    val price: Double = 31.90 // 64-bit

    val byte: Byte = 8 // 8-bit
    val short: Short = 16 // 16-bit
    val age: Int = 29 // 32-bit (99% tempo)
    val long: Long = 123412341234 // 64-bit

    val product: String = "iMac"

    println(price::class)
    println(product::class)
    println(age::class)
}