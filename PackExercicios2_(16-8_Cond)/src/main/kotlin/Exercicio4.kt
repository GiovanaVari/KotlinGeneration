import kotlin.math.pow
import kotlin.math.sqrt

/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
fun main() {
    print("Digite um número: ")
    val num = readln().toInt()
    if (num % 2 == 0) {
        println("O número $num é par")
        println("A raiz quadrada de $num é: ${sqrt(num.toDouble())}")
    } else {
        println("O número $num é ímpar")
        println("O quadrado de $num é: ${num.toDouble().pow(2)}")
    }
}