package Exercicio1Animal

class Cavalo(
    nome: String,
    idade: Double
) : Animal(nome, idade) {
    override fun emiteSom() {
        println("iiirrrrĂ­")
    }

    override fun movimentar() {
        println("Trotando")
    }

    override fun toString(): String {
        return "Nome: $nome\n" +
                "Idade: $idade"
    }
}