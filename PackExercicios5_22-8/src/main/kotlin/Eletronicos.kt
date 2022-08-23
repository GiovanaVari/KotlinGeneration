class Eletronicos(
    val nome: String,
    val marca: String,
    val voltagem: Int,
    val cor: String,
    val categoria: String
) {
    var valor: Double = 0.0
    var desc = false
    var novo = false

    fun promocao() {
        println("Valor na gondola: ")
        valor = readln().toDouble()
        if (cor == "branco" || cor == "vermelho") {
            desc = true
            valor -= valor * 0.07
            println("Valor promocional de R$${"%.2f".format(valor)}")
        } else {
            println("Infelizmente este produto não esta em promoção!")
        }
    }
}