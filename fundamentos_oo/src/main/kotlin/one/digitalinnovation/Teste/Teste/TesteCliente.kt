package one.digitalinnovation.Teste.Teste

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.123.456-77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    Autenticacao().autentica(jose)
}