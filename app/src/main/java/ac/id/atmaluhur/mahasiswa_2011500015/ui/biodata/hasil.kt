package ac.id.atmaluhur.mahasiswa_2011500015.ui.biodata

import ac.id.atmaluhur.mahasiswa_2011500015.R
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class hasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_biodata)

        val modeEdit = intent.hasExtra("NAMA") && intent.hasExtra("NIM") &&
                intent.hasExtra("JURUSAN") && intent.hasExtra("HOBI")
        title = if (modeEdit) "FRAGMENT GALLERY" else "FRAGMENT GALLERY"

        val Nama = findViewById<EditText>(R.id.etNama)
        val Nim = findViewById<EditText>(R.id.etNIM)
        val rdMI = findViewById<RadioButton>(R.id.rdMI)
        val rdSI = findViewById<RadioButton>(R.id.rdSI)
        val rdTI = findViewById<RadioButton>(R.id.rdTI)
        val makan = findViewById<CheckBox>(R.id.cbMakan)
        val tidur = findViewById<CheckBox>(R.id.cbTidur)
        val belajar = findViewById<CheckBox>(R.id.cbBelajar)
        val btntampilkan = findViewById<Button>(R.id.btnTampil)


        btntampilkan.setOnClickListener {
            if ("${Nama.text}".isNotEmpty() && "${Nim.text}".isNotEmpty()) {
                val i = Intent(this@hasil, GalleryViewModel::class.java)
                i.putExtra("NIM", "${Nama.text}")
                i.putExtra("Nama", "${Nim.text}")
                i.putExtra("NIM", "${rdMI.text}")
                i.putExtra("Nama", "${rdSI.text}")
                i.putExtra("Nama", "${rdTI.text}")
                i.putExtra("Nama", "${makan.text}")
                i.putExtra("Nama", "${tidur.text}")
                i.putExtra("Nama", "${belajar.text}")
                startActivity(i)
            }else
                Toast.makeText(this@hasil, "Nama : Rizki Pratama" +
                        "Nim : 2011500015" +
                        "Jurusan : TI" +
                        "Hobi : Makan, Belajar", Toast.LENGTH_SHORT).show()
            }
        }
    }