package com.evgeny_m.data.chatsfirebase

import com.evgeny_m.data.models.DataChatsList

interface FirebaseChatsList {

    fun getChats(): List<DataChatsList>
    //fun loadChats() : Boolean
}