package one.digitalinnovation.Teste.Teste

import one.digitalinnovation.Banco

fun main(){
 val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    val banco2 = digiOneBank.copy(nome = "legal", numero = 45)


    println(digiOneBank.nome)
    println(digiOneBank.numero)
    println(banco2.nome + banco2.numero)


}