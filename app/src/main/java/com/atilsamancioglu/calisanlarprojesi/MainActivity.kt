package com.atilsamancioglu.calisanlarprojesi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*
         +1) Calisanlar sinifi oluşturulacak
         +2) Çalışanların isim, maaş, departman, yaş bilgilerini tutacağız
         +3) Örnek 10 tane çalışan oluşturup, bir listede bu çalışanlar toplanacak (MainActivity içinde yapabilirsiniz) (yazılım, finans, satış)
         +4) İsim bilgileri sadece okunabilir olacak. calisan.isim = "sdfld" değişiklik yapılamayacak
         +5) Maaş bilgileri okunabilir de olmayacak, yazılabilir de olmayacak. Sadece maasGoster denilen bir fonksiyonla okunabilecek.
            Bu fonksiyon içerisine aldığı objenin maaşını gösterecek.
         +6) MainActivity içerisinde -> yaşı 30'dan büyük olan ve departmanı yazılım olan kişilerin maaşlarını tutan bir liste yapınız. (maasGoster fonksiyonuyla yazdırsanız da olur)
         +7) MainActivity içerisinde -> yaşı 25'den küçük olan kişilerin sadece isimlerini tutan bir liste yapmanız yeterli olur.
         */


        val atil = Calisan("Atıl",10000,"Yazılım",35)
        //println(atil.isim)
        //atil.maasGoster()
        val zeynep = Calisan("Zeynep",50000,"Satış",20)
        val atlas = Calisan("Atlas",150000,"Yazılım",10)
        val mehmet = Calisan("Mehmet",30000,"Finans",45)
        val ahmet = Calisan("Ahmet",5000,"Satış",30)
        val levent = Calisan("Levent",20000,"Yazılım",55)
        val alev = Calisan("Alev",200000,"Satış",60)
        val ayse = Calisan("Ayşe",24000,"Satış",40)
        val fatih = Calisan("Fatih",55000,"Yazılım",36)
        val osman = Calisan("Osman",32000,"Finans",13)

        val calisanlar = arrayListOf(atil,zeynep,atlas,mehmet,ahmet,levent,alev,ayse,fatih,osman)

        val yedinciSoruListesi = calisanlar.filter { it.yas < 25}.map{it.isim}
        //yedinciSoruListesi.forEach { println(it) }

        val altinciSoruListesi = calisanlar.filter { it.yas > 30 }.filter { it.departman == "Yazılım" }.map { it.maasGoster() }

    }
}