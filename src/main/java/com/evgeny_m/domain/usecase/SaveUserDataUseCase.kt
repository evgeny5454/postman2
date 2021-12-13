package com.evgeny_m.domain.usecase

import com.evgeny_m.domain.models.DomainUserModel
import com.evgeny_m.domain.repository.UserRepository


class SaveUserDataUseCase(private val userRepository: UserRepository) {

    fun execute(param: DomainUserModel): Boolean {
        return userRepository.saveUserData(saveParam = param)
    }
}