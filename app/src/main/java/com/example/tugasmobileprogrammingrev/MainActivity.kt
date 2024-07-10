package com.example.tugasmobileprogrammingrev

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.text.Html

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)

        val multiLineText = Html.fromHtml("<b>BIODATA</b><br><br>" +
                "<b>Nama</b> : Dwi Prasetyo<br>" +
                "<b>Kelas</b> : TI21K1<br>" +
                "<b>Program Studi</b> : Teknik Informatika")

        textView.text = multiLineText
    }
}
