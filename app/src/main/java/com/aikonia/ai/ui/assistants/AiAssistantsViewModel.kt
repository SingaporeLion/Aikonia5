package com.aikonia.ai.ui.assistants

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.aikonia.ai.data.model.AiAssistantModel


class AiAssistantsViewModel : ViewModel() {
    val showVertical = mutableStateOf(false)
    val verticalShowList = mutableStateListOf<AiAssistantModel>()
    val selectedValue = mutableStateOf("")
}