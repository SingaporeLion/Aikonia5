package com.aikonia.ai.domain.use_case.message

import com.aikonia.ai.data.model.MessageModel
import com.aikonia.ai.domain.repository.MessageRepository
import javax.inject.Inject

class CreateMessagesUseCase @Inject constructor(
    private val messageRepository: MessageRepository
) {
    suspend operator fun invoke(message: MessageModel) =
        messageRepository.addMessage(message)
}