package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val clientePF = ClienteTipo.PF
    val clientePJ = ClienteTipo.PJ

    println("${clientePF.name} - ${clientePF.descricao}")
    println("${clientePJ.name} - ${clientePJ.descricao}")
}