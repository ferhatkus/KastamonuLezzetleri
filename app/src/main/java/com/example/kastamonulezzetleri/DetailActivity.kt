package com.example.kastamonulezzetleri

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge


class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detay_sayfasi)
        renderDetail()
    }

    fun renderDetail() {
        var backIntent: Intent? = null
        var detailTopTitle = findViewById<TextView>(R.id.DetailPageTopTitle)
        var detailImageView = findViewById<ImageView>(R.id.DetailPageImageView)
        var detailPageTitle = findViewById<TextView>(R.id.DetailPageTitle)
        var detailPageContent = findViewById<EditText>(R.id.DetailPageContent)
        var buttonId = intent.getIntExtra("buttonId", 0)
        if (buttonId == R.id.EtliEkmekButton) {
            backIntent = Intent(
                this,
                YoreselLezzetlerActivity::class.java
            )
            detailTopTitle.setText("YÖRESEL LEZZETLER")
            val imageUri = Uri.parse("android.resource://" + packageName + "/" + R.drawable.etli_ekmek)
            detailImageView.setImageURI(imageUri)

            detailPageTitle.setText("Etli Ekmek")
            detailPageContent.setText("Kastamonu'nun meşhur lezzetlerinden biri olan etli ekmek, " +
                    "ince açılmış hamurun üzerine kıymalı harç konularak pişirilir. " +
                    "Üzerine ince doğranmış soğan, domates ve biber eklenir.")
        } else if (buttonId == R.id.BandumaButton) {
            backIntent = Intent(
                this,
                YoreselLezzetlerActivity::class.java
            )
            detailTopTitle.setText("YÖRESEL LEZZETLER")
            val imageUri = Uri.parse("android.resource://" + packageName + "/" + R.drawable.banduma)
            detailImageView.setImageURI(imageUri)

            detailPageTitle.setText("Banduma")
            detailPageContent.setText("Hindi veya tavuk eti ile yapılan bu yemek, yufka ekmeklerinin " +
                    "et suyu ile ıslatılması ve üzerine didiklenmiş et konulmasıyla hazırlanır. " +
                    "Üzerine ceviz ve tereyağı gezdirilerek servis edilir.")
        } else if (buttonId == R.id.KuyuKebabiButton) {
            backIntent = Intent(
                this,
                YoreselLezzetlerActivity::class.java
            )
            detailTopTitle.setText("YÖRESEL LEZZETLER")
            val imageUri = Uri.parse("android.resource://" + packageName + "/" + R.drawable.kuyu_kebabi)
            detailImageView.setImageURI(imageUri)

            detailPageTitle.setText("Kuyu Kebabı")
            detailPageContent.setText("Kastamonu'nun meşhur et yemeklerinden biridir. " +
                    "Etler, özel olarak hazırlanmış kuyularda uzun süre pişirilir ve " +
                    "yumuşacık hale gelir. Genellikle pilav ve sebzelerle birlikte sunulur.")
        } else if (buttonId == R.id.KastamonuKalesiButton) {
            backIntent = Intent(
                this,
                GezilecekYerlerActivity::class.java
            )
            detailTopTitle.setText("GEZİLECEK YERLER")
            val imageUri = Uri.parse("android.resource://" + packageName + "/" + R.drawable.kastamonu_kalesi)
            detailImageView.setImageURI(imageUri)

            detailPageTitle.setText("Kastamonu Kalesi")
            detailPageContent.setText("Şehir merkezinde bulunan Kastamonu Kalesi, Bizans döneminden " +
                    "kalma tarihi bir yapıdır. Kale, şehre hakim bir tepede yer alır ve ziyaretçilere " +
                    "geniş bir panoramik manzara sunar.")
        } else if (buttonId == R.id.VallaKanyonuButton) {
            backIntent = Intent(
                this,
                GezilecekYerlerActivity::class.java
            )
            detailTopTitle.setText("GEZİLECEK YERLER")
            val imageUri = Uri.parse("android.resource://" + packageName + "/" + R.drawable.valla_kanyonu)
            detailImageView.setImageURI(imageUri)

            detailPageTitle.setText("Valla Kanyonu")
            detailPageContent.setText("Pınarbaşı ilçesinde bulunan Valla Kanyonu, doğa tutkunları " +
                    "için heyecan verici bir yerdir. Türkiye'nin en derin kanyonlarından biri olan " +
                    "Valla Kanyonu, zorlu yürüyüş parkurları ve nefes kesici manzaralarıyla ünlüdür.")
        } else if (buttonId == R.id.GiderosButton) {
            backIntent = Intent(
                this,
                GezilecekYerlerActivity::class.java
            )
            detailTopTitle.setText("GEZİLECEK YERLER")
            val imageUri = Uri.parse("android.resource://" + packageName + "/" + R.drawable.gideros)
            detailImageView.setImageURI(imageUri)

            detailPageTitle.setText("Gideros")
            detailPageContent.setText("Cide ilçesi sınırları içerisinde yer almakta ve Cide ilçesi ile " +
                    "Bartın iline bağlı olan Kurucaşile ilçesi arasındaki karayolu " +
                    "üzerinde bulunan doğal sit alanıdır. Koyun denize açıldığı ağız ancak büyükçe " +
                    "iki tekne genişliğindedir. Eskiden korsanların saklanma yeri olduğu söylenir.")
        }

        val backButton = findViewById<Button>(R.id.BackButton)
        backButton.setOnClickListener {
            startActivity(backIntent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }
    }

}