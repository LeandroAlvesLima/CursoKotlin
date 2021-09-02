package one.digitalinnovation

class Pessoa {
    var nome:String = " Leandro "
    var cpf:String = " 123.123.123.-12"
    private set
}
fun main(){
    val Leandro = Pessoa()

    println(Leandro.nome)
    println(Leandro.cpf)

}