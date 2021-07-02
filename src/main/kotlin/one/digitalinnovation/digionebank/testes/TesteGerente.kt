package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val marcos = Gerente(nome = "Marcos", cpf = "111.222.333-44", salario = 10000.0)

    ImprimeRelatorioFuncionario.imprime(marcos)
}