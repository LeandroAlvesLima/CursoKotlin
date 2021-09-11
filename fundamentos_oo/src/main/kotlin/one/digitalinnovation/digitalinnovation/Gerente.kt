package one.digitalinnovation.digitalinnovation

class Gerente(nome: String, cpf: String, salario: Double, val senha:String): Funcionario(nome, cpf, salario), logavel {
    override fun calculoAuxilio(): Double = salario * 0.4

    override fun login(): Boolean = "senha123" == senha


}