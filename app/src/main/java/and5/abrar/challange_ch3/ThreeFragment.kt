package and5.abrar.challange_ch3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_three.*


class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nama = arguments?.getString("nama")
        val usia = arguments?.getString("usia")
        val type = arguments?.getString("typeusia")
        val alamat = arguments?.getString("alamat")
        val kerja = arguments?.getString("kerja")
        Text1.text = "Nama Anda : $nama"
        if (usia!=null){
            Text2.text = "Usia Anda : $usia bernilai : $type"
            Text3.text = "Alamat Anda : $alamat"
            Text4.text = "Pekerjaan Anda : $kerja"
        }else{
            Text2.text = " "
            Text3.text = " "
            Text4.text = " "
        }
        Btn3.setOnClickListener {
            val bundle = bundleOf("nama" to nama)
            Navigation.findNavController(view).navigate(R.id.tigakeempat,bundle)
        }

    }
}