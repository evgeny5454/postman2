package com.evgeny_m.data.repository

import com.evgeny_m.data.chatsfirebase.FirebaseChatsListImpl
import com.evgeny_m.data.models.DataChatsList
import com.evgeny_m.domain.models.DomainChatModel
import com.evgeny_m.domain.repository.ChatsRepository

class ChatsRepositoryImp(private val chatsStorage: FirebaseChatsListImpl) : ChatsRepository {



    override fun getChats(): List<DomainChatModel> {
        val chats = chatsStorage.getChats()
        return mapChatToDomain(chats)
    }

    private fun mapChatToDomain(chat: List<DataChatsList>): List<DomainChatModel> {
        val listToDomain = mutableListOf<DomainChatModel>()
        chat.forEach {
            val item = DomainChatModel(
                id = it.userId,
                name = it.name,
                photo = it.photo,
                lastMessage = it.lastMessage,
                newMessageCounter = it.newMessagesCounter

            )
            listToDomain.add(item)
        }
        return listToDomain
    }
}