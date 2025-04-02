/*
1. Criar um programa que deverá comparar a igualdade de duas Strings. Ou seja, a string A é igual a string B?

2. Crie uma variável que armazene a sua idade e verifique se, com a idade informada, pode-se dirigir (regra para CNH → +18 anos pode dirigir)

3. Inverta a lógica, ou seja, verifique se a idade informada NÃO pode dirigir

4. Para praticar condições compostas, verifique se é um motorista OU se ele tem 17 anos ou mais

5. Para praticar condições compostas, verifique se é um motorista E se ele tem mais de 30 anos

6. Crie um programa com 2 variáveis, uma que represente um nome de produto e outra que represente o preço. Agora, somente imprima uma mensagem como "desconto aplicado" quando o produto for iMac E o preço for maior ou igual a 10 mil. Imprima também o valor com desconto aplicado de 12% para esse produto. Ou seja, a saída deve ser algo como: desconto aplicado de 12%. Total a pagar: R$ 19360
 */

fun main() {
    // 1.
    val a = "iMac"
    val b = "iPhone"
    println(a == b)

    // 2.
    print("Digite sua idade: ")
    val idade = readln().toInt()
    if (idade >= 18) println("Você Pode dirigir!")
    else println("Você NÃO pode dirigir!")

    // 3.
    print("Digite sua idade: ")
    val idade2 = readln().toInt()
    if (idade2 < 18) println("Você NÂO Pode dirigir!")
    else println("Você pode dirigir!")

    // 4.
    print("É motorista? Sim[S] ou Não[N]")
    val motorista = readln().uppercase()
    print("Idade: ")
    val age = readln().toInt()
    if (motorista == "S" || age >= 17) println("Aprovado!")
    else println("Reprovado!")

    // 5.
    print("É motorista? Sim[S] ou Não[N]")
    val motorista2 = readln().uppercase()
    print("Idade: ")
    val age2 = readln().toInt()
    if (motorista2 == "S" && age2 > 30) println("Aprovado!")
    else println("Reprovado!")

    // 6.
    print("Produto: ")
    val produto = readln()
    print("Preço: ")
    val preco = readln().toDouble()
    val desconto = 12
    if (produto == "iMac" && preco >= 10_000) {
        println("Desconto aplicado de 12%. Total a pagar: R$ ${preco - (preco * desconto / 100)}")
    } else {
        println("Sem desconto! Total a pagar: R$ $preco")
    }

}