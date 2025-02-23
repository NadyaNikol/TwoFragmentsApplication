package com.example.twofragmentsapplication.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.twofragmentsapplication.databinding.FragmentTwoBinding
import com.example.twofragmentsapplication.ui.viewModels.SharedViewModel
import kotlinx.coroutines.launch


class FragmentTwo : BaseFragment<FragmentTwoBinding>(FragmentTwoBinding::inflate) {

    private lateinit var sharedViewModel: SharedViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedViewModel =
            ViewModelProvider(requireActivity())[SharedViewModel::class.java]

        viewLifecycleOwner.lifecycleScope.launch {
            sharedViewModel.uiState.collect {
                binding.tvText.text = it
            }
        }
    }
}
