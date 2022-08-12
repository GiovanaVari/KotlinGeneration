/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.*/

    fun main()
    {
        var n : Int = 0
        var soma : Int = 0
        var media : Int
        var total : Int = 0

        while(n >= 0) {
            //Entrada do número
            println("Digite um número: ")
            n = readLine()!!.toInt()

            //Checa se o número é positivo
            if(n >= 0) {
                //Soma os números digitados
                soma += n
                //Guarda quantos números foi digitado
                total++
            }
        }
        //Calcula a média dos números
        media = (soma - n) / total

        //Mostra quantos números foi digitado
        println("Foram digitados $total números ")
        //Mostra a soma dos números
        println("A soma desses números é: $soma")
        //Mostra a média dos números
        println("A média é: $media")

    }