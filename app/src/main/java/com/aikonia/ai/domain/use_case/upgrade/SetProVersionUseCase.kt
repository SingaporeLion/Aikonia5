package com.aikonia.ai.domain.use_case.upgrade

import com.aikonia.ai.domain.repository.PreferenceRepository
import javax.inject.Inject

class SetProVersionUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke(isProVersion: Boolean) = preferenceRepository.setProVersion(isProVersion)
}
