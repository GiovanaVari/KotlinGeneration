/*1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.*/
fun main(){
    var E : Double
    var M : Double

    println("Qual o peso dos tomates: ")
    var P: Double = readLine()!!.toDouble()
    if(P > 50){

        E = P - 50
        M = 4.00 * E
        println("O peso excedeu: $E kg")
        println("Valor da multa a pagar é: R$$M")
    }else{
        E = 0.00
        M = 0.00
        println("O peso excedeu: $E kg")
        println("Valor da multa a pagar é: R$$M")
        println("O PESO NÃO FOI EXCEDIDO")
        println("NÃO PAGARÁ MULTA")
        println("SEJA FELIZ")
    }
}
