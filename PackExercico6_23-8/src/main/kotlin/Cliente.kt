/*1. Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch*/
class Cliente(
    val nome: String,
    val endereco: String,
    val telefone: String
) {
    private var listaDeCompras = mutableListOf<String>()

    init {
        checarNome()
    }

    fun addItem(item: String) {
        if (item.isNotBlank()) {
            listaDeCompras.add(item)
            println("Item adicionado com sucesso!")
        } else {
            println("Item Invalido!")
        }
    }

    fun removerItem(item: String) {
        if (listaDeCompras.contains(item)) {
            listaDeCompras.remove(item)
            println("Item removido com sucesso!")
        } else {
            println("O item $item não existe na lista!")
        }
    }

    fun listarItem() {
        println("*******Produtos*******")
        listaDeCompras.forEach {
            println(it)
        }
    }

    private fun checarNome() {
        if (nome.isBlank()) {
            throw Exception("Erro no cadastro!")
        }
    }
}

