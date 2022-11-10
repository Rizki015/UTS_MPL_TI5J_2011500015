package ac.id.atmaluhur.mahasiswa_2011500015.ui.tampilan

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TampilanViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "UTS MPL ( Rizki Pratama )"
    }
    val text: LiveData<String> = _text
}