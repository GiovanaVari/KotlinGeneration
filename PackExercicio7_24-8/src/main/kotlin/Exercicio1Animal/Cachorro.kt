package Exercicio1Animal

class Cachorro(
    nome: String, idade: Double
) : Animal(nome, idade) {
    override fun emiteSom() {
        println("Au Au")
    }

    override fun movimentar() {
        println("Correndo")
    }

    override fun toString(): String {
        return "Nome: $nome\n" + "Idade: $idade"
    }

}