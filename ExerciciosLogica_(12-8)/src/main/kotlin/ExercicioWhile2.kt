/*
2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.*/

fun main() {
    var n: Int

    //Entrada do número
    println("Digite um número: ")
    n = readLine()!!.toInt()

    //Mostrando n
    println(n)

    //Repetição ate 100
    while (n <= 100) {

        //Calculando a multi por 3
        n = n * 3
        //Mostrando n
        println(n)

    }
}