package com.aikonia.ai.domain.repository

interface FirebaseRepository {
    suspend fun isThereUpdate(): Boolean
}