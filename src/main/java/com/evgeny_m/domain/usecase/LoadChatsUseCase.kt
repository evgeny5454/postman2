package com.evgeny_m.domain.usecase

import com.evgeny_m.domain.models.DomainChatModel
import com.evgeny_m.domain.repository.ChatsRepository

class LoadChatsUseCase(private val userRepository: ChatsRepository) {

    fun execute() : List<DomainChatModel>{
        return userRepository.getChats()
    }
}