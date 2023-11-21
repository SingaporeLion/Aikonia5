package com.muratozturk.conversai.domain.use_case.conversation

import com.muratozturk.conversai.domain.repository.ConversationRepository
import javax.inject.Inject

class GetConversationsUseCase @Inject constructor(
    private val conversationRepository: ConversationRepository
) {
    suspend operator fun invoke() =
        conversationRepository.getConversations()
}