package com.evgeny_m.domain.usecase

import com.evgeny_m.domain.models.DomainUserModel
import com.evgeny_m.domain.repository.UserRepository

class LoadUserDataUseCase(private val userRepository: UserRepository) {

    fun execute() : DomainUserModel{
        return userRepository.getUserData()
    }
}