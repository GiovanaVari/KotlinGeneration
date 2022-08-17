/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */
fun main() {
    var cont = 0
    var soma = 0
    do {
        print("Digite um número (0 para sair): ")
        var n = readln().toInt()
        if (n % 3 == 0 && n != 0) {
            soma = soma + n
            cont++
        }
    } while (n != 0)
    var media = (soma / cont)
    println()
    println("A média dos números digitados múltiplos de 3 é: $media")
}