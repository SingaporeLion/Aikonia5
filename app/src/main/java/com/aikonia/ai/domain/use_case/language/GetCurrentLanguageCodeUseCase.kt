package com.aikonia.ai.domain.use_case.language

import com.aikonia.ai.domain.repository.PreferenceRepository
import javax.inject.Inject

class GetCurrentLanguageCodeUseCase @Inject constructor(private val preferenceRepository: PreferenceRepository) {
    operator fun invoke() = preferenceRepository.getCurrentLanguageCode()
}