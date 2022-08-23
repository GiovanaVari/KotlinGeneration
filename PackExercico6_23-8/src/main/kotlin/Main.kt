/*1. Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch*/
fun main() {
    try {
        print("Digite o nome: ")
        val nome = readln()
        print("Digite o endereço: ")
        val end = readln()
        print("Digite o telefone: ")
        val tel = readln()
        val cliente = Cliente(nome, end, tel)

        while (true) {
            println("-----------Menu-----------")
            println("1 - Para adicionar item")
            println("2 - Para remover item")
            println("3 - Para listar itens")
            println("4 - Para sair")
            println()
            print("Opção: ")
            when (readln().toInt()) {
                1 -> {
                    println()
                    print("Digite o item: ")
                    val nomeItem = readln()
                    cliente.addItem(nomeItem)
                }
                2 -> {
                    print("Digite o item que deseja remover: ")
                    val nome = readln()
                    cliente.removerItem(nome)
                }
                3 -> {
                    cliente.listarItem()
                }
                4 -> break
                else -> println("Opção Invalida")
            }
        }

    }catch (e: Exception){
        println(e.message)
    }
}