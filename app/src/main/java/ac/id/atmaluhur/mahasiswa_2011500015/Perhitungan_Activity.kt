package ac.id.atmaluhur.mahasiswa_2011500015

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class Perhitungan_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perhitungan)
        val panjang = findViewById<EditText>(R.id.etPanjang)
        val lebar = findViewById<EditText>(R.id.etLebar)

        val btnHasil = findViewById<Button>(R.id.btnHitung_luas)

        btnHasil.setOnClickListener {
            var etpanjang = panjang.text.toString()
            var etlebar = lebar.text.toString()
            var tvhasil : Int? = null

            var hasil = etpanjang.toInt() * etlebar.toInt()
             tvhasil.toString()

        }
        val btnkembali = findViewById<Button>(R.id.btnKembali)

        btnkembali.setOnClickListener{
            val i = Intent(this@Perhitungan_Activity, UTSMPL::class.java)
            startActivity(i)
        }
    }

    }


