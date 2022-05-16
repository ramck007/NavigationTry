package com.example.navigationtry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.navigationtry.databinding.FragmentSecondBinding


/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_second, container, false)
        val binding : FragmentSecondBinding = DataBindingUtil.inflate(
            inflater,R.layout.fragment_second,container,false
        )
        binding.secondFragmentbutton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_thirdFragment)
        )
        return binding.root
    }

}