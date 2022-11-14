package ac.id.atmaluhur.mahasiswa_2011500015

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.fragment.app.Fragment

class BiodataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val etNim = findViewById<EditText>(R.id.etNama)
        val etNama = findViewById<EditText>(R.id.etNIM)
        val rdTi = findViewById<RadioButton>(R.id.rdTI)
        val makan = findViewById<CheckBox>(R.id.cbMakan)
        val belajar = findViewById<CheckBox>(R.id.cbBelajar)
        val tampil = findViewById<Button>(R.id.btnTampil)


        tampil.setOnClickListener {
            val nama = "${etNama}"
            val nim = "${etNim}"
            val jurusan = "${rdTi}"
            val hobi = "${makan}"
            val hobi2 = "${belajar}"


            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            val fragment = BiodataFragment()
            val b = Bundle()
            b.putString("Nama", nama )
            b.putString("Nim", nim )
            b.putString("Jurusan", jurusan )
            b.putString("Hobi", hobi )
            b.putString("Hobi", hobi2 )
            fragment.arguments = b
            ft.replace(R.id.fragdata, fragment ).commit()
        }

    }
}