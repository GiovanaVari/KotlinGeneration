import java.time.LocalDate

//1 - O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.
fun main() {
    val ano = LocalDate.now().year
    println("Digite sua idade:")
    val idade = readln().toInt()
    println("Você ja fez aniversario esse ano? (s|n) ")
    val fezNiver = readln()
    if(fezNiver == "s"){
        println("Você nasceu no ano: ${ano-idade}")}
    else{println("Você nasceu no ano: ${(ano-idade)-1}")}
}