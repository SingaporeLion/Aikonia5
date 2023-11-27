package com.aikonia.ai.domain.use_case.message

import com.aikonia.ai.domain.repository.PreferenceRepository
import javax.inject.Inject

class GetFreeMessageCountUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke() = preferenceRepository.getFreeMessageCount()
}