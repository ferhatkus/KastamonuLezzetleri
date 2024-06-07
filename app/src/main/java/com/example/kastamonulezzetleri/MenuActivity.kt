package com.example.kastamonulezzetleri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kastamonulezzetleri.ui.theme.KastamonuLezzetleriTheme


class MenuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val backButton = findViewById<Button>(R.id.BackButton)
        backButton.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        val yoreselLezzetlerButton = findViewById<Button>(R.id.YoreselLezzetlerButton)
        yoreselLezzetlerButton.setOnClickListener {
            val intent = Intent(
                this,
                YoreselLezzetlerActivity::class.java
            )
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        val gezilecekYerlerButton = findViewById<Button>(R.id.GezilecekYerlerButton)
        gezilecekYerlerButton.setOnClickListener {
            val intent = Intent(
                this,
                GezilecekYerlerActivity::class.java
            )
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

    }
}