package Exercicio1Animal

fun main() {

    while (true) {
        println("-----Menu-----")
        println("1 - Cão")
        println("2 - Cavalo")
        println("3 - Preguiça")
        println("4 - Sair")
        println()
        print("Escolha uma opção: ")
        when (readln().toInt()) {
            1 -> {
                val cao = Cachorro(
                    "Dolinho", 1.0
                )
                cao.emiteSom()
                cao.movimentar()
                println(cao)
            }
            2 -> {
                val potrinho = Cavalo(
                    "Zé", 0.5
                )
                potrinho.emiteSom()
                potrinho.movimentar()
                println(potrinho)
            }
            3 -> {
                val sidi = Preguica(
                    "Sidinha", 4.0
                )
                sidi.emiteSom()
                sidi.movimentar()
                println(sidi)
            }
            4 -> break
            else -> println("Opção invalida!")
        }
    }
}
