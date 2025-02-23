package com.example.twofragmentsapplication.ui.viewModels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * Created by Nadya N. on 23.02.2025.
 */
class SharedViewModel : ViewModel() {

    private var _uiState: MutableStateFlow<String?> = MutableStateFlow("text")
    val uiState: StateFlow<String?> = _uiState

    fun updateState(text: String?) {
        _uiState.value = text
    }
}