package com.example.twofragmentsapplication.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

/**
 * Created by Nadya N. on 23.02.2025.
 */
open class BaseFragment<T : ViewBinding>(
    private val createViewBinding: (
        inflater: LayoutInflater,
        parent: ViewGroup?,
        attachToParent: Boolean,
    ) -> T,
) : Fragment() {

    private var _binding: T? = null
    val binding
        get() = _binding?: throw RuntimeException("Binding is null for ${this::class.java.name}")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = createViewBinding(inflater, container, false)
        return binding.root
    }
}