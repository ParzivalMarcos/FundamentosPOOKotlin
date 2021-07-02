package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jao = Cliente(
        nome = "Jao da Silva",
        cpf = "789.123.456-99",
        clienteTipo = ClienteTipo.PF,
        senha = "1q2w3e"
    )

    println(jao)

    TesteAutenticacao().autentica(jao)
}