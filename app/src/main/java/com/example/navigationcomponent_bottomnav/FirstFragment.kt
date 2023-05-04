package com.example.navigationcomponent_bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent_bottomnav.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater,container,false)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_homeChildFragment)
        }
        return binding.root
    }


}