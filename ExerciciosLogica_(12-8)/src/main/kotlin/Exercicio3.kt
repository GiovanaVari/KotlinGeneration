/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	*/

fun main() {
    var q1: Int
    var q2: Int
    var q3: Int
    var q4: Int

    //Entrada dos numeros
    println("Digite o primeiro número: ")
    var n1: Int = readLine()!!.toInt()

    println("Digite o segundo número: ")
    var n2: Int = readLine()!!.toInt()

    println("Digite o terceiro número: ")
    var n3: Int = readLine()!!.toInt()

    println("Digite o quarto número: ")
    var n4: Int = readLine()!!.toInt()

    //Calculando o quadrado
    q1 = n1 * n1
    q2 = n2 * n2
    q3 = n3 * n3
    q4 = n4 * n4

    //checando se quadrado do n3 é maior que 1000
    if (q3 >= 1000) {
        //Mensagem informando o resultado de n3 ao quadrado
        println("O quadrado de $n3 é: $q3")
    } else {
        //Mensagem informando os respectivos resultados
        println("O quadrado de $n1 é: $q1")
        println("O quadrado de $n2 é: $q2")
        println("O quadrado de $n3 é: $q3")
        println("O quadrado de $n4 é: $q4")
    }
}