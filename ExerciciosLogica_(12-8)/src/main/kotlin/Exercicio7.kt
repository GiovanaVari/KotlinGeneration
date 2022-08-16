/*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/

fun main() {
    var area: Double

    //Entrada dos valores da base e altura do triângulo
    println("Digite a base do triângulo: ")
    var base: Double = readLine()!!.toDouble()
    println("Digite a altura do triângulo: ")
    var altura: Double = readLine()!!.toDouble()

    //Checa se os valores de base e altura são positivos maiores que zero
    if (base > 0 && altura > 0) {

        //Calculando a area
        area = base * altura

        //Mostrando o resultado do calculo
        println("A area do triângulo é: $area")
    }
}
