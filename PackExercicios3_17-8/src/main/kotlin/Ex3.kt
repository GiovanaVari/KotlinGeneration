/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
*/
fun main() {
    var total21 = 0
    var total50 = 0
    var idade = 0
    while (true) {
        print("Digite sua idade: ")
        var idade = readln().toInt()
        if (idade == -99) {
            break
        } else if (idade < 21) {
            total21++
        } else if (idade > 50) {
            total50++
        }
    }
    println()
    println("Total de pessoas com menos de 21 anos de idade: $total21")
    println("Total de pessoas com mais de 50 anos de idade: $total50")
}