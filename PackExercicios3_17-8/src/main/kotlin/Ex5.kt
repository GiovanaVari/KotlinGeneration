/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/
fun main() {
    var soma: Int = 0

    do {
        //Entrada do número
        print("Digite um número: ")
        var n = readln().toInt()
        //Soma os números digitados
        soma += n
    } while (n != 0)
    //Mostra a soma dos números
    println("A soma desses números é: $soma")
}
