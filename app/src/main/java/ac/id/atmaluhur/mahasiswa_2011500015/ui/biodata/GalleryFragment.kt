package ac.id.atmaluhur.mahasiswa_2011500015.ui.biodata

import ac.id.atmaluhur.mahasiswa_2011500015.databinding.FragmentBiodataBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import android.widget.*

class GalleryFragment : Fragment() {

    private var _binding: FragmentBiodataBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
            val galleryViewModel =
                ViewModelProvider(this).get(GalleryViewModel::class.java)

            _binding = FragmentBiodataBinding.inflate(inflater, container, false)
            val root: View = binding.root

            val textView: TextView = binding.textGallery
            galleryViewModel.text.observe(viewLifecycleOwner) {
                textView.text = it
            }

            return root
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }

}


