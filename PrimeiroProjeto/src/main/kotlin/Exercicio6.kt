    /*6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
    categorias:
    Infantil A = 5 a 7 anos
    Infantil B = 8 a 11 anos
    Juvenil A = 12 a 13 anos
    Juvenil B = 14 a 17 anos
    Adultos = Maiores de 18 anos*/

    fun main()
    {
        //Entrada de idade
        println("Digite sua idade: ")
        var idade : Int = readLine()!!.toInt()

        //Checa se idade esta entre 5 e 7
        if(idade >= 5 && idade <= 7 ){
            //Informa a categoria
            println("Categoria Infantil A")
        }
        //Checa se idade esta entre 8 e 11
        if(idade >= 8 && idade <= 11 ){
            //Informa a categoria
            println("Categoria Infantil B")
        }
        //Checa se idade esta entre 12 e 13
        if(idade >= 12 && idade <= 13 ){
            //Informa a categoria
            println("Categoria Juvenil A")
        }
        //Checa se idade esta entre 14 e 17
        if(idade >= 14 && idade <= 17 ){
            //Informa a categoria
            println("Categoria Juvenil B")
        }
        //Checa se idade esta acima de 17
        if(idade >= 18){
            //Informa a categoria
            println("Categoria Adultos")
        }

    }
