package com.example.navigationtry

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation
import com.example.navigationtry.databinding.FragmentSecondBinding
import com.example.navigationtry.databinding.FragmentThirdBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ThirdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThirdFragment : Fragment() {

    //private lateinit var
   // val activity = getActivity()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_third, container, false)
        val binding : FragmentThirdBinding = DataBindingUtil.inflate(
            inflater,R.layout.fragment_third,container,false
        )
        //binding.thirdFragmentbutton.setOnClickListener(R.id.firstActivityButton)

      /*  binding.thirdFragmentbutton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_thirdFragment)
        )*/

        binding.thirdFragmentbutton.setOnClickListener{
            val intent = Intent(this@ThirdFragment.requireContext(),FirstActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }

}