import java.time.LocalDate

//Faça um sistema que leia a idade de uma pessoa expressa em anos,
// meses e dias e mostre-a expressa apenas em dias (sem contar ano bi e meses com 31 dias)
fun main() {
    print("Digite quantos anos você tem: ")
    val ano = readln().toInt()
    print("Digite quantos meses: ")
    val mes = readln().toInt()
    print("Digite quantos dias: ")
    val dia = readln().toInt()
    val dias = dia + (mes * 30) + (ano * 365)
    println()
    print("Sua idade em dias é: $dias")

}