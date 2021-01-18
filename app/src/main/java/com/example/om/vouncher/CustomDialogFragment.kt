package com.example.om.vouncher

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.om.R
import com.example.om.database.VouncherItemEntity
import com.example.om.databinding.FragmentCustomDialogBinding
import org.w3c.dom.Text

class CustomDialogFragment : Fragment() {

    private lateinit var viewModel : VouncherItemViewmodel
    private lateinit var binding : FragmentCustomDialogBinding
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCustomDialogBinding.inflate(inflater)
       viewModel = ViewModelProvider(this).get(VouncherItemViewmodel::class.java)
//        binding.viewModel = viewModel
        binding.addBtn.setOnClickListener{
          view-> insertVouncherItemtoDatabase()

        }

        binding.cancelBtn.setOnClickListener{view ->

            view.findNavController().navigate(R.id.action_customDialogFragment_to_createNewVouncherFragment)

        }

        return binding.root
    }

     fun insertVouncherItemtoDatabase() {

        val itemName = binding.dialogItemName.text.toString()
        val quantity = binding.dialogItemQuantity.text.toString()
        val price = binding.dialogItemPrice.text.toString()

        Toast.makeText(requireContext(),"Successfully Added!",Toast.LENGTH_SHORT).show()
        if(inputCheck(itemName,quantity,price)){

         //   val amount = Integer.parseInt(quantity) * Integer.parseInt(price)
           val vouncherItemEntity = VouncherItemEntity(0,itemName,400,2 ,5000)
            viewModel.addVouncherItem(vouncherItemEntity)
            Toast.makeText(requireContext(),"Successfully Added!",Toast.LENGTH_SHORT).show()

            //Navigate Back
            findNavController().navigate(R.id.action_customDialogFragment_to_createNewVouncherFragment)
        }else{
            Toast.makeText(requireContext(),"Please fill out all fields.",Toast.LENGTH_SHORT).show()
        }

    }

    private fun inputCheck(itemName: String, quantity: String, price: String): Boolean {
        return !(TextUtils.isEmpty(itemName) || TextUtils.isEmpty(quantity) || TextUtils.isEmpty(price))

    }


}