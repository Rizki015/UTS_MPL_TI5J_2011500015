package ac.id.atmaluhur.mahasiswa_2011500015

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {
    var etUsr: EditText? = null
    var etPass: EditText? = null
    var lgon: Button? = null
    var i: Intent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsr = findViewById<View>(R.id.etUsername) as EditText
        etPass = findViewById<View>(R.id.etPassword) as EditText
        lgon = findViewById<View>(R.id.btnLogin) as Button

        fun masuk(view: View?) {
            val sun = etUsr!!.toString()
            val sp = etPass!!.toString()
            if (sun == "Rizki Pratama" && sp == "Rizki652") {
                val i = Intent(this@MainActivity, UTSMPL::class.java)
                startActivity(i)
            } else {
                Toast.makeText(
                    applicationContext, "Username atau password salah",
                    Toast.LENGTH_SHORT
                ).show()
                etUsr!!.setText("")
                etPass!!.setText("")
            }
        }
    }
}


