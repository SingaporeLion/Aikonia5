package com.aikonia.ai.domain.use_case.conversation

import com.aikonia.ai.domain.repository.ConversationRepository
import javax.inject.Inject

class GetConversationsUseCase @Inject constructor(
    private val conversationRepository: ConversationRepository
) {
    suspend operator fun invoke() =
        conversationRepository.getConversations()
}