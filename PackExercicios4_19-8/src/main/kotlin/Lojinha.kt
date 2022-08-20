/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
fun main() {
    while (true) {
        println("*****************Menu*****************")
        println("1 - Para adicionar um produto")
        println("2 - Para remover um produto")
        println("3 - Para atualizar produto")
        println("4 - Para exibir produtos e quantidades")
        println("5 - Para Sair")
        println()
        print("Opção: ")
        when (readln().toInt()) {
            1 -> addproduto()
            2 -> remover()
            3 -> update()
            4 -> exibir()
            5 -> break
        }
    }
}
