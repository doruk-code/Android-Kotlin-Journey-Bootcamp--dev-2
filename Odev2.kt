package com.example.kotlindersleri.odev

class Odev2 {
    fun soru1(km: Double): Double {
        return km * 0.621
    }
    fun soru2(uzunKenar: Int, kisaKenar: Int): Int {
        return uzunKenar * kisaKenar
    }
    fun soru3(sayi: Int): Int {
        var faktoriyel = 1
        for (i in 1..sayi) {
            faktoriyel *= i
        }
        return faktoriyel
    }
    fun soru4(kelime: String): Int {
        var eHarfiSayisi = 0
        for (harf in kelime) {
            if (harf == 'e') {
                eHarfiSayisi++
            }
        }
        return eHarfiSayisi
    }
    fun soru5(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }
    fun soru6(gunSayisi: Int): Double {
        val normalCalismaSaati = 8
        val mesaiSaatiBaslangici = 150
        val saatlikCalismaUcreti = 40.0
        val saatlikMesaiUcreti = 80.0
        val toplamCalismaSaati = gunSayisi * normalCalismaSaati
        val normalCalismaSaatiUcreti = toplamCalismaSaati * saatlikCalismaUcreti
        val mesaiSaati = if (toplamCalismaSaati > mesaiSaatiBaslangici) toplamCalismaSaati - mesaiSaatiBaslangici else 0
        val mesaiUcreti = mesaiSaati * saatlikMesaiUcreti
        return normalCalismaSaatiUcreti + mesaiUcreti
    }
    fun soru7(sure: Int): Int {
        val saatlikUcret = 50
        val ekUcret = 10
        return saatlikUcret + (sure - 1) * ekUcret
    }
}