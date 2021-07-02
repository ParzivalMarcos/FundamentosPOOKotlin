package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val marcos = Gerente(nome = "Marcos", cpf = "111.222.333-44", salario = 10000.0, senha = "1q2w3e")

    ImprimeRelatorioFuncionario.imprime(marcos)

    TesteAutenticacao().autentica(marcos)
}