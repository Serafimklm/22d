package com.example.myapplication

import com.example.recursoscompartilhadosentreapps.Passageiro

fun main() {
    val passageiro = Passageiro();
    passageiro.nome = "senna"
    passageiro.caucularPrecoPassagem()
    println("o nome do passageiro é: ${passageiro.nome}")
}