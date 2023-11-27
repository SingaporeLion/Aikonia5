package com.aikonia.ai.domain.use_case.upgrade

import com.aikonia.ai.domain.repository.PreferenceRepository
import javax.inject.Inject

class IsProVersionUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke() = preferenceRepository.isProVersion()
}