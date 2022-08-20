fun operacoes(op: Int, n1: Double, n2: Double) {
    if (op == 1) {
        println("******Opção Soma*******")
        val soma = n1 + n2
        println(soma)
    } else if (op == 2) {
        println("******Opção Subtração******")
        val sub = n1 - n2
        println(sub)
    } else if (op == 3) {
        println("******Opção Divisão*******")
        val div = n1 / n2
        println(div)
    } else if (op == 4) {
        println("******Opção Multiplicação*******")
        val mult = n1 * n2
        println(mult)
    } else {
        println("******Fim do Programa*******")
    }
}