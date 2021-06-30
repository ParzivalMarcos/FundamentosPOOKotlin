package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Marcos"

    var cpf: String = "111.222.333-44"
    private set // Impede que seja os valores sejam alterados

    inner class Endereco {
        var rua: String = "Rua ABC"
    }
}

fun main() {
    val marcos = Pessoa()

    println(marcos.nome)
    println(marcos.cpf)
}