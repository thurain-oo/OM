package com.example.om.vouncher

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.om.R
import com.example.om.databinding.FragmentVouncherBinding


class VouncherFragment : Fragment() {
    private lateinit var binding : FragmentVouncherBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentVouncherBinding.inflate(inflater)


        binding.floatingActionButton.setOnClickListener{ view->
            view.findNavController().navigate(R.id.action_vouncherFragment_to_createNewVouncherFragment)
        }
        return binding.root
    }


}