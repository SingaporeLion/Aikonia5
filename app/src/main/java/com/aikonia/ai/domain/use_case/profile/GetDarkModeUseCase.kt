package com.aikonia.ai.domain.use_case.profile

import com.aikonia.ai.domain.repository.PreferenceRepository
import javax.inject.Inject

class GetDarkModeUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke() = preferenceRepository.getDarkMode()
}