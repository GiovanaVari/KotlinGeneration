//1) Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informações deste objeto no console.
class Cliente(
    val cpf: String,
    val nome: String,
    val nasc: String,
    val end: String,
    val email: String,
) {
    var pedidos = 0
    var newCliente = false
    var descontoPri = false

    constructor(
        cpf: String,
        nome: String,
        nasc: String,
        end: String,
        email: String,
        pedidos: Int,
        newCliente: Boolean,
        descontoPri: Boolean
    ) : this(cpf, nome, nasc, end, email) {
        this.pedidos = pedidos
    }

    fun consPedidos(pedidos: Int) {
        if (pedidos <= 0) {
            newCliente = true
            descontoPri = true
            println("Está é sua primeira compra e terá um cupom de desconto")
            println("Utilize o cupom 'primeiropedido' e ganhei 10% de desconto")
            println()
        }
    }

    fun newPedido() {
        print("Deseja comprar quantos produtos? ")
        var numProd = readln().toInt()
        pedidos = +numProd
        println("Você já efetuou $pedidos pedidos")
    }
}