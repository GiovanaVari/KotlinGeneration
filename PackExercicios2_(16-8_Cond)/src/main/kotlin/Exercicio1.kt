//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
fun main() {
    //Entrada do primeiro número
    println("Digite o primeiro número: ")
    val num1 = readln()
    //Entrada do segundo número
    println("Digite o segundo número: ")
    val num2 = readln()
    //Entrada do terceiro número
    println("Digite o terceiro número: ")
    val num3 = readln()
    //Verifica se o primeiro é o maior
    if (num1 > num2 && num1 > num3) {
        //Mostra o primeiro e diz que é o maior
        print("O número $num1 é o maior")
    }
    //Verifica se o segundo é o maior
    else if (num2 > num1 && num2 > num3) {
        //Mostra o segundo e diz que é o maior
        print("O número $num2 é o maior")
    } else {
        //Mostra o terceiro e diz que é o maior
        print("O número $num3 é o maior")
    }
}