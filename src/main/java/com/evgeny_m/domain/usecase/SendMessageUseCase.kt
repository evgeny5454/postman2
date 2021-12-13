package com.evgeny_m.domain.usecase

import com.evgeny_m.domain.repository.MessagesRepository

class SendMessageUseCase(private val messagesRepository: MessagesRepository) {

    fun execute(
        message: String,
        currentUserId: String,
        receivingUserId: String,
        type: String
    ) {
        return messagesRepository.sendMessage(
            message = message,
            currentUserId = currentUserId,
            receivingUserId = receivingUserId,
            type = type
        )
    }
}