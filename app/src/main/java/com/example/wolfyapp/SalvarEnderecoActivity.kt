package com.example.wolfyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_salvar_endereco.*

class SalvarEnderecoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salvar_endereco)

        btn_salvar_endereco.setOnClickListener {

            var isEndereco:Boolean = edt_endereco.text.isNotEmpty()

            if(isEndereco) {
                val intent = Intent(applicationContext, NavegacaoActivity::class.java)
                startActivity(intent)
            } else {
                ob_endereco.setVisibility(View.VISIBLE)
            }
        }
    }
}
