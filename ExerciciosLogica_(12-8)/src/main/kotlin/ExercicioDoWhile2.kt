/*
2- Faça um programa que pegue um número do teclado e calcule a soma de todos os
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.*/

    fun main()
    {

        var soma: Int = 0
        var n: Int
        var num: Int

        //Entrada do número
        println("Digite um número: ")
        num = readLine()!!.toInt()

        //Salva o número para mostrar depois
        n=num

        do{
            //Soma os números
            soma = soma + num
            //Diminui 1 do número digitado
            num--
        }while(num > 0)

        //Mostra o resultado da soma de 1 até o número digitado
        println("A soma de 1 a $n é: $soma")
    }