/*8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
for maior que 100, caso contrário imprimi-la com o valor zero.*/

fun main() {
    //Entrada de n
    println("Digite um número: ")
    var n: Double = readLine()!!.toDouble()

    //Checa se n é maior que 100
    if (n > 100) {
        //Informa o número digitado
        println("O número é: $n")
    } else {
        n = 0.00
        println("O número é: $n")
    }
}
