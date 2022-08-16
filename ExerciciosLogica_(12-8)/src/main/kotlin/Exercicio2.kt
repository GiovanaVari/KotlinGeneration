/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*/
fun main(){
   var S : Double
   var E : Double
   var ST : Double
    //Entrada de código e numero de horas trabalhadas
    println("Digite seu código: ")
    var C: Int = readLine()!!.toInt()
    println("Digite o número de horas trabalhadas: ")
    var N: Double = readLine()!!.toDouble()

    //Checando se passa de 50 horas de trabalho
    if(N >= 50){
        //Calculando o excesso de horas
        E = (N - 50) * 20.00
        //Calculando o salario
        S = 50 * 10.00

    } else{
        //Zerando horas excedidas e calculando o salario
        E=0.00
        S = N * 10.00
    }

    //Calculando o total do salario
    ST = S + E

    //Mensagem mostrando o valor do salario sem as horas excedidas, o salario excedente e o salario total
    println("Salario: R$$S")
    println("Salario excedente: R$$E")
    println("Salario total: R$$ST")

}

