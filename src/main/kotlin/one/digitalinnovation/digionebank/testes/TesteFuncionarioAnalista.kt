package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val tom = Analista(nome = "Tom Miau", cpf = "555.666.777-88", salario = 5000.0)

    ImprimeRelatorioFuncionario.imprime(tom)
}