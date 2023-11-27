package com.aikonia.ai.data.repository

import com.aikonia.ai.data.model.ConversationModel
import com.aikonia.ai.data.source.local.ConversAIDao
import com.aikonia.ai.domain.repository.ConversationRepository
import javax.inject.Inject


class ConversationRepositoryImpl @Inject constructor(
    private val conversAIDao: ConversAIDao

) : ConversationRepository {
    override suspend fun getConversations(): MutableList<ConversationModel> =
        conversAIDao.getConversations()

    override suspend fun addConversation(conversation: ConversationModel) =
        conversAIDao.addConversation(conversation)

    override suspend fun deleteConversation(conversationId: String) {
        conversAIDao.deleteConversation(conversationId)
        conversAIDao.deleteMessages(conversationId)
    }


    override suspend fun deleteAllConversation() = conversAIDao.deleteAllConversation()

}