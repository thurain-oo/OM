package com.example.om.vouncher

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.om.R
import com.example.om.database.VouncherItemDatabase
import com.example.om.databinding.FragmentCreateNewVouncherBinding
import com.google.android.material.snackbar.Snackbar


class CreateNewVouncherFragment : Fragment() {


    private lateinit var binding: FragmentCreateNewVouncherBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateNewVouncherBinding.inflate(inflater)

        binding.addVouncherItemFab.setOnClickListener{ view->
            view.findNavController().navigate(R.id.action_createNewVouncherFragment_to_customDialogFragment)
        }


//
//        var viewModel = ViewModelProvider(this).get(VouncherItemViewmodel::class.java)
//        binding.viewModel= viewModel
        // Inflate the layout for this fragment
        return binding.root
    }





}