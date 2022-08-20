val prod = mutableListOf<String>()

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
fun addProd() {
    while (true) {
        println("*************Menu*************")
        println("1 - Para adicionar um produto")
        println("2 - Para voltar")
        println()
        print("Opção: ")
        when (readln().toInt()) {
            1 -> {
                println("Digite o produto: ")
                val nome = readln()
                if (prod.contains(nome)) {
                    println("Este produto já existe no estoque")
                } else {
                    prod.add(nome)
                }
            }
            2 -> break
        }
    }
}

fun removerProd() {
    while (true) {
        println("*************Menu*************")
        println("1 - Para remover um produto")
        println("2 - Para voltar")
        println()
        print("Opção: ")
        when (readln().toInt()) {
            1 -> {
                print("Digite qual produto deseja remover: ")
                val nome = readln()
                if (prod.contains(nome)) {
                    prod.remove(nome)
                } else {
                    println("O produto $nome não existe no estoque")
                }
            }
            2 -> break
        }
    }
}

fun updateProd() {
    while (true) {
        println("*************Menu************")
        println("1 - Para alterar um produto")
        println("2 - Para voltar")
        println()
        print("Opção: ")
        when (readln().toInt()) {
            1 -> {
                print("Digite qual produto deseja alterar: ")
                val nome = readln()
                if (prod.contains(nome)) {
                    val posicao = prod.indexOf(nome)
                    println("Digite o novo produto: ")
                    prod[posicao] = readln()
                    println("Atualizado com sucesso!")
                } else {
                    println("O produto $nome não existe no estoque")
                }
            }
            2 -> break
        }
    }
}

fun exibirProd() {
    println("*******Estoque*******")
    prod.forEach {
        println(it)
    }
}
