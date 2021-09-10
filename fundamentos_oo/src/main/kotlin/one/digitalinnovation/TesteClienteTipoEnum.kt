package one.digitalinnovation

import one.digitalinnovation.digitalinnovation.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {elemento ->
        println("${elemento.name}+$elemento")

    }
    ClienteTipo.values().forEach {
        println("${it.name}+$it")

    }
}