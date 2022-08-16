/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.*/
fun main() {
    var r: Int

    //Entra com o número
    println("Digite um número: ")
    var n: Int = readLine()!!.toInt()

    //Calcula o resto
    r = n % 2

    //Checa se o resto é igual a 0 (se n é par)
    if (r == 0) {
        //Mensagem informando que n é par
        println("O número $n é par")
        //Checa se n é positivo ou negativo
        if (n >= 0) {
            //Mensagem informando que n é positivo
            println("O número $n é positivo")
        } else {
            //Mensagem informando que n é negativo
            println("O número $n é negativo")
        }
    } else {
        //Mensagem informando que n é impar
        println("O número $n é impar")
        //Checa se n é positivo ou negativo
        if (n >= 0) {
            //Mensagem informando que n é positivo
            println("O número $n é positivo")
        } else {
            //Mensagem informando que n é negativo
            println("O número $n é negativo")
        }
    }
}
