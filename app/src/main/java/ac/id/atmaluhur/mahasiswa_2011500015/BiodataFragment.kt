package ac.id.atmaluhur.mahasiswa_2011500015

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*


class BiodataFragment : Fragment() {
    override fun onCreateView(
        inflater : LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val v = inflater.inflate(R.layout.fragment_biodata2, container ,false)
        val tvData = v.findViewById<TextView>(R.id.tvData)
        if (arguments != null) {
            val nama = requireArguments().getString("Nama")
            val nim = requireArguments().getString("Nim")
            val jurusan = requireArguments().getString("Jurusan")
            val hobi = requireArguments().getString("Hobi")
            val hobi2 = requireArguments().getString("Hobi2")

            tvData.text ="""
                NIM : $nim
                Nama : $nama
                Jurusan : $jurusan
                Hobi : $hobi,$hobi2
            """.trimIndent()
        }
        return v

    }
}
