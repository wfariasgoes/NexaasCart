package br.com.nexaas.nexaascart.features.view

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlin.coroutines.CoroutineContext

class HomeViewModel(
    private val dispatcher: CoroutineContext = Dispatchers.Main + SupervisorJob()
): ViewModel() {
}