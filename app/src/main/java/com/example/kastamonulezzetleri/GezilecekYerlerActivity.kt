package com.example.kastamonulezzetleri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge


class GezilecekYerlerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gezilecek_yerler)

        val backButton = findViewById<Button>(R.id.BackButton)
        backButton.setOnClickListener {
            val intent = Intent(
                this,
                MenuActivity::class.java
            )
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        clickButtonEvent(R.id.KastamonuKalesiButton);
        clickButtonEvent(R.id.VallaKanyonuButton);
        clickButtonEvent(R.id.GiderosButton);

    }

    fun clickButtonEvent(buttonId: Int) {
        val button = findViewById<Button>(buttonId)
        button.setOnClickListener {
            val intent = Intent(
                this,
                DetailActivity::class.java
            )

            intent.putExtra("buttonId", buttonId);
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
}