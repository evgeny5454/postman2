package com.evgeny_m.domain.repository

import com.evgeny_m.domain.models.DomainChatModel

interface ChatsRepository {

    fun getChats() : List<DomainChatModel>
}