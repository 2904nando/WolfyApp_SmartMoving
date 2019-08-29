package com.example.wolfyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_navegacao.*

class NavegacaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navegacao)

        btn_sair_navegacao.setOnClickListener {
            val intent = Intent(applicationContext, PesquisaActivity::class.java)
            startActivity(intent)
        }
    }
}
