package com.example.wolfyapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Lidar com clique do botão de cadastro
        btn_cadastro.setOnClickListener {

            //Verificar se todos os campos foram preenchidos
            var isNome:Boolean = edt_nome.text.isNotEmpty()
            var isEmail:Boolean = edt_email.text.isNotEmpty()
            var isSenha:Boolean = edt_senha.text.isNotEmpty()
            var isData:Boolean = edt_data_nasc.text.isNotEmpty()

            if (isNome && isEmail && isSenha && isData) {
                val intent = Intent(applicationContext, SalvarEnderecoActivity::class.java)
                startActivity(intent)
            }
            //Colocar mensagens de erro nos campos não preenchidos
            else {
                if (!isNome) {
                    ob_nome.setVisibility(View.VISIBLE)
                } else {
                    ob_nome.setVisibility(View.GONE)
                }
                if (!isEmail) {
                    ob_email.setVisibility(View.VISIBLE)
                } else {
                    ob_email.setVisibility(View.GONE)
                }
                if (!isSenha) {
                    ob_senha.setVisibility(View.VISIBLE)
                } else {
                    ob_senha.setVisibility(View.GONE)
                }
                if (!isData) {
                    ob_data.setVisibility(View.VISIBLE)
                } else {
                    ob_data.setVisibility(View.GONE)
                }
                Toast.makeText(applicationContext, "Campos devem estar preenchidos!", 2)
            }

        }
    }


}
