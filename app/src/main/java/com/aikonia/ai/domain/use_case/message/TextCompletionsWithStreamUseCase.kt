package com.aikonia.ai.domain.use_case.message

import com.aikonia.ai.data.model.TextCompletionsParam
import com.aikonia.ai.domain.repository.ChatRepository
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class TextCompletionsWithStreamUseCase @Inject constructor(
    private val chatRepository: ChatRepository
) {
    operator fun invoke(scope: CoroutineScope, params: TextCompletionsParam) =
        chatRepository.textCompletionsWithStream(scope, params)
}