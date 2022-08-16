/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/

    fun main()
    {
        var filho : Int
        var mf : Int = 0
        var salario : Double
        var medias : Double = 0.00
        var sm : Double = 0.00
        var perc : Double = 0.00
        var cont : Double = 0.00
        var i : Int

        for (i = 1; i <= 20; i++) {

        //Entrada dos dados
        println("Digite seu salário: ")
        salario = readLine()!!.toDouble()

        println("Digite número de filhos: ")
        filho = readLine()!!.toInt()

        //Calculando média filhos
        mf = mf + filho

        //Calculando Média salário
        medias = medias + salario

        //Checa se é o maior salário
        if (salario >= sm){
            //Guarda o maior salário
            sm = salario
        }
        //Checa se o salário é menor igual a 100
        if(salario <= 100){
            //Conta
            cont ++
        }
    }
        //Calculando o percentual de pessoas com salário menor igual a 100
        perc = (cont/20)*100

        //Calculandi média de salário
        medias = medias/20
        //Calculando média de filhos
        mf = mf/20

        //Mostra média dos salários
        println("Média do salário da população: R$$medias")
        //Mostra média de filhos
        println("Média de filhos: $mf")
        //Mostra maior salário
        println("Maior salário: R$sm")
        //Mostra percentual de salários menor igual a 100
        println("Percentual de pessoas que ganham abaixo de R$100,00: $perc %")

    }