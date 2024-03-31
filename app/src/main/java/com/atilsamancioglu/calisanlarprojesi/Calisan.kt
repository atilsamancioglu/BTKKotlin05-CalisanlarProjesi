package com.atilsamancioglu.calisanlarprojesi

class Calisan(val isim: String,  maas: Int, var departman: String, var yas: Int) {

    private val _maas = maas

    fun maasGoster() {
        println(this._maas)
    }
}