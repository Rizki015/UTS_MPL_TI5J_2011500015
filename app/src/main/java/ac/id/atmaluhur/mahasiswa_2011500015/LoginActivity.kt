package ac.id.atmaluhur.mahasiswa_2011500015

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsernmae = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnProses = findViewById<Button>(R.id.btnLogin)


        btnProses.setOnClickListener{
            if("${etUsernmae.text}".isNotEmpty() &&"${etPassword.text}".isNotEmpty()){
                val i =Intent(this@LoginActivity,MainActivity ::class.java)
                i.putExtra("Username", "${etUsernmae.text}")
                i.putExtra("Password", "${etPassword.text}")
                startActivity(i)
            } else {
                Toast.makeText(
                    applicationContext, "Username atau password salah",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }
    }
}


