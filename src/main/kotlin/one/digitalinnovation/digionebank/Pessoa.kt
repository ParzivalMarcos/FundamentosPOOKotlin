package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Marcos"
    var cpf: String = "111.222.333-44"
}

fun main() {
    val marcos = Pessoa()

    println(marcos.nome)
    println(marcos.cpf)
}