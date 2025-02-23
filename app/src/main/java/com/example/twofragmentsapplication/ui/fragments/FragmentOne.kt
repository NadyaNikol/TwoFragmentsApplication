package com.example.twofragmentsapplication.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.twofragmentsapplication.databinding.FragmentOneBinding
import com.example.twofragmentsapplication.ui.viewModels.SharedViewModel

class FragmentOne : BaseFragment<FragmentOneBinding>(FragmentOneBinding::inflate) {

    private lateinit var sharedViewModel: SharedViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedViewModel = ViewModelProvider(requireActivity())[SharedViewModel::class.java]

        binding.btnText.setOnClickListener {
            sharedViewModel.updateState("new text")
        }
    }

}