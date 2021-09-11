package one.digitalinnovation.Teste.Teste

import one.digitalinnovation.digitalinnovation.Gerente

fun main(){

    val maria = Gerente("Maria", "12312312312",5000.0, senha = "senha123")
    imprimiRelatorioFuncionario.imprime(maria)

    Autenticacao().autentica(maria)
}
