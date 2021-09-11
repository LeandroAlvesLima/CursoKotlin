package one.digitalinnovation.Teste.Teste

import one.digitalinnovation.digitalinnovation.Funcionario
import one.digitalinnovation.digitalinnovation.Pessoa
import java.math.BigDecimal

fun main(){
    val Leandro = Pessoa(nome= "Leandro", cpf="12312312312")
    println(Leandro.nome)
    println(Leandro.cpf)

    val joao = Funcionario("leandro", "12312312312",BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}