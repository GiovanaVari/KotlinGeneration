package Exercicio1Animal

class Preguica(
    nome: String,
    idade: Double
) : Animal(nome, idade) {
    override fun emiteSom() {
        println("Aaaa aaaa aaaa")
    }

    override fun movimentar() {
        println("Subindo na árvore")
    }

    override fun toString(): String {
        return "Nome: $nome\n" +
                "Idade: $idade"
    }
}