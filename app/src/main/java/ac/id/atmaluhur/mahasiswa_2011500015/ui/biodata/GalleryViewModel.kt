package ac.id.atmaluhur.mahasiswa_2011500015.ui.biodata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value
    }
    val text: LiveData<String> = _text

        }
