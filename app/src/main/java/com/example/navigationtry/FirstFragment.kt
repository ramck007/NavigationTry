package com.example.navigationtry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.navigationtry.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_first, container, false)
        val binding : FragmentFirstBinding = DataBindingUtil.inflate(
            inflater,R.layout.fragment_first,container,false
        )
        binding.firstFragmentbutton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment)
        )
    return binding.root
    }


}