package me.firdaus1453.findmyage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO 1 membuat pendeteksi pada saat tombol hitung di tekan
        btnHitung.setOnClickListener {

            // TODO 2 Mengambil inputan dari user
            val tahunLahir = edtTahunLahir.text.toString().toIntOrNull()

            // TODO 3 Mencek variable tahunLahir apakah sudah ada isinya?
            if (tahunLahir != null) {    // Apabila tahunLahir ada isinya maka jalankan perintah dibawah ini

                // TODO 4 melakukan operasi perhitungan umur dengan rumus tahun sekarang - tahun lahir
                val age = Calendar.getInstance().get(Calendar.YEAR) - tahunLahir

                // TODO 5 Menampilkan hasil umur ke layar
                txtUmur.text = age.toString()

            } else { // Apabila year tidak ada isinya

                // TODO 6 Menampilkan pesan error pada view/widget edittext di layar
                edtTahunLahir.error = "Masukkan tahun lahir"

            }
        }
    }

}
