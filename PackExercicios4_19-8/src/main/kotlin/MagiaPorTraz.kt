val produtos = mutableMapOf<String, Int>()
var estoque = 0

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
fun addproduto() {
    println("Digite o produto: ")
    val nome = readln()
    println("Quatos desse item tem no estoque: ")
    val estoque = readln().toInt()
    produtos[nome] = estoque
}

fun remover() {
    print("Digite qual produto deseja remover: ")
    val nome = readln()
    produtos.remove(nome)
}

fun update() {
    println("Infelizmente não da para fazer alterações")
    /*
    while (true) {
        println("*****************Menu*****************")
        println("1 - Para alterar um produto")
        println("2 - Para alterar o estoque do produto")
        println("3 - Para voltar")
        println()
        print("Opção: ")
        when (readln().toInt()) {
            1 -> {
                print("Digite qual produto deseja alterar: ")
                val produto = readln()
                //val posicao = produtos.indexOf(produto)
                //print("Digite a alteração: ")
                //produtos[posicao] = readln()
            }
            2 -> {
                print("Digite qual produto deseja alterar: ")
                val produto = readln()
                print("Digite a quantidade atual do produto: ")
                estoque = readln().toInt()
                produtos[produto] = estoque
            }
            3 -> break
        }
    }    */

}

fun exibir() {
    produtos.forEach { (k, v) ->
        println("Quantidade: $v, Produto: $k")
    }
}