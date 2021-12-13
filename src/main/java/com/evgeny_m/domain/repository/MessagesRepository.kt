package com.evgeny_m.domain.repository

import com.evgeny_m.domain.models.DomainMessageModel

interface MessagesRepository {

    fun getMessagesList(): List<DomainMessageModel>

    fun sendMessage(
        message: String,
        currentUserId: String,
        receivingUserId: String,
        type: String
    )
}