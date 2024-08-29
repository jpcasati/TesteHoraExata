package br.edu.mouralacerda.testehoraexata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Date

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.btnMudar)

        botao.setOnClickListener {

//            Toast.makeText(this, "Botão Funcionando!", Toast.LENGTH_LONG).show()

            val dataAtual = Date()

//            val formato = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
            val formato = SimpleDateFormat("HH:mm")

            val hora = formato.format(dataAtual)

            val textoDaTela = findViewById<TextView>(R.id.txtHoraExata)

            val campoNome = findViewById<EditText>(R.id.edtNome)

            val nome = campoNome.text.toString()

            val resultadoFinal = "Olá $nome, são $hora"

            textoDaTela.text = resultadoFinal

            botao.isClickable = false

        }

        val botaoFechar = findViewById<Button>(R.id.btnFechar)

        botaoFechar.setOnClickListener {

//            finish()
            botao.isClickable = true
        }




    }

}