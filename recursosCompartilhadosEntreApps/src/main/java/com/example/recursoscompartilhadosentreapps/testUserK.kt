package com.example.recursoscompartilhadosentreapps

fun main() {

    val passageiro = Passageiro()
    passageiro.nome = "senna"
    passageiro.caucularPrecoPassagem()
    println("o nome do passageiro que solicitou a corrida: ${passageiro.nome}")

    }
