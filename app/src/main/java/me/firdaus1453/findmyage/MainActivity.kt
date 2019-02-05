package me.firdaus1453.findmyage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener {
            if (edtTahunLahir.text.toString().isNotEmpty()) {
                val year = edtTahunLahir.text.toString().toInt()
                val age = Calendar.getInstance().get(Calendar.YEAR) - year
                txtUmur.text = age.toString()
            }else{
                edtTahunLahir.error = "Masukkan tahun lahir"
            }
        }
    }

}
