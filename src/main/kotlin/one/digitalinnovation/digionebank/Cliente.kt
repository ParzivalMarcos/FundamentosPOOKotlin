package one.digitalinnovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "1q2w3e" == senha
    override fun toString(): String = """
          Nome: $nome
          CPF: $cpf
          Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}
