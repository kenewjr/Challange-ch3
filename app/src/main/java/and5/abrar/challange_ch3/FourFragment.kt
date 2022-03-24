package and5.abrar.challange_ch3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_four.*


class FourFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_four, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        kembalike3.setOnClickListener {
                val nama = arguments?.getString("nama")
                val usia = inputusia.text.toString()
                val typeusia:String
                if(usia.toInt()%2==0){
                    typeusia = "genap"
                }else{
                    typeusia = "ganjil"
                }
                val alamat = inputalamat.text.toString()
                val kerja = inputpekerjaan.text.toString()
                val bundle = bundleOf(
                    "nama" to nama,
                    "usia" to usia,
                    "typeusia" to typeusia,
                    "alamat" to alamat,
                    "kerja" to kerja)
                Navigation.findNavController(view).navigate(R.id.empatketiga,bundle)
        }
    }

}