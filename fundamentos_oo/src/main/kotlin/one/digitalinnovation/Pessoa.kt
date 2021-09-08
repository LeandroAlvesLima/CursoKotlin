package one.digitalinnovation

class Pessoa {
    var nome:String = " Leandro "
    var cpf:String = " 123.123.123.-12"
    private set

    constructor()

    fun pessoaInfo( )="$nome + $cpf"
}
fun main(){
    val Leandro = Pessoa()

    println(message = Leandro.pessoaInfo())


}