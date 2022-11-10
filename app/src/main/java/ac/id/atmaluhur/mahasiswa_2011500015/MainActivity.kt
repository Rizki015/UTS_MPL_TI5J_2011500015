package ac.id.atmaluhur.mahasiswa_2011500015

import ac.id.atmaluhur.mahasiswa_2011500015.UTSMPL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsernmae = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnProses = findViewById<Button>(R.id.btnLogin)

        btnProses.setOnClickListener{
            if("${etUsernmae.text}".isNotEmpty() &&"${etPassword.text}".isNotEmpty()){
                val i =Intent(this@MainActivity,UTSMPL ::class.java)
                i.putExtra("Username", "${etUsernmae.text}")
                i.putExtra("Password", "${etPassword.text}")
                startActivity(i)
            }else
                Toast.makeText(this@MainActivity, "Username atau Password belum diisi", Toast.LENGTH_SHORT).show()
        }
    }
}