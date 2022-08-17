/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
*/
fun main() {
    var par = 0
    var impar = 0
    for (i in 1..10) {
        print("Digite um número: ")
        var n = readln().toInt()
        if (n % 2 == 0) {
            par++
        } else {
            impar++
        }
    }
    println()
    println("Foram digitados $par números pares")
    println("Foram digitados $impar números ímpares")
}