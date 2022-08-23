fun main() {
    while (true) {
        println("******************Menu******************:")
        println("1 - Para testar o exercicio 1")
        println("2 - Para testar o exercicio 2")
        println("3 - Para testar o exercicio 3")
        println("4 - Para testar o exercicio 4")
        println("5 - Para testar o exercicio 5")
        println("6 - Para testar o exercicio 6")
        println("7 - Para testar o exercicio 7")
        println("8 - Para Sair")
        println()
        print("Opção: ")
        when (readln().toInt()) {
            1 -> {
                print("CPF: ")
                val CPF = readln()
                print("Nome: ")
                val NOME = readln()
                print("Data de nascimento: ")
                val NASC = readln()
                print("Endereço: ")
                val END = readln()
                print("Email: ")
                val EMAIL = readln()
                println()
                val pessoa1 = Cliente(
                    CPF, NOME, NASC, END, EMAIL
                )
                pessoa1.consPedidos(0)
                pessoa1.newPedido()
            }
            2 -> {
                val Boeing7478 = Aviao(
                    2130,
                    410,
                    "Lufthansa",
                    "Frankfurt (FRA)",
                    false
                )
                Boeing7478.tipo()
                Boeing7478.particular()
                println()
                println(Boeing7478.iden)
                println(Boeing7478.numAs)
                println(Boeing7478.comp)
                println(Boeing7478.dest)
            }
            3 -> {
                val PSP = Eletronicos(
                    "PSP",
                    "Playstation",
                    110,
                    "vermelho",
                    "Game"
                )
                PSP.promocao()
            }
            4 -> {
                println("Não foi feito ainda!")
                break
            }
            5 -> {
                println("Não foi feito ainda!")
                break
            }
            6 -> {
                println("Não foi feito ainda!")
                break
            }
            7 -> {
                println("Não foi feito ainda!")
                break
            }
            8 -> break
        }
    }

}

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.

2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.

3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.

4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.

5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.

6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.
7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/