import kotlin.math.pow

//2 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele
fun main(){
    val pi = 3.14159265359
    println("Digite o diâmetro do circulo:")
    val diametro = readln().toDouble()
    val raio = diametro / 2
    val area = pi * raio.pow(2)
    val perimetro = 2 * pi * raio
    println("A área do circulo é: ${"%.2f".format(area)}")
    println("O perímetro do circulo é: ${"%.2f".format(perimetro)}")

}