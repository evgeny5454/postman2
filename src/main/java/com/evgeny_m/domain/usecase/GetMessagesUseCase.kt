package com.evgeny_m.domain.usecase

import com.evgeny_m.domain.models.DomainMessageModel
import com.evgeny_m.domain.repository.MessagesRepository

class GetMessagesUseCase(private val messagesRepository: MessagesRepository) {
    fun execute() : List<DomainMessageModel> {
        return messagesRepository.getMessagesList()
    }
}