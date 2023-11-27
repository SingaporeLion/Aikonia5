package com.aikonia.ai.domain.repository

import com.aikonia.ai.data.model.MessageModel

interface MessageRepository {
    suspend fun getMessages(conversationId: String): List<MessageModel>
    suspend fun addMessage(message: MessageModel)
    suspend fun deleteMessages(conversationId: String)
}