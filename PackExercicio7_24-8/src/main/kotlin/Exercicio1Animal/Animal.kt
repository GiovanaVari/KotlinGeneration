package Exercicio1Animal

abstract class Animal(
    val nome: String,
    val idade: Double
) {

    abstract fun emiteSom()
    abstract fun movimentar()
}