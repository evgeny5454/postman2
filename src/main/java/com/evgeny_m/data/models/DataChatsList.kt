package com.evgeny_m.data.models

data class DataChatsList(
    val userId: String = "",
    val name: String = "",
    val photo: String = "",
    val lastMessage: String = "",
    val newMessagesCounter: Int = 0
)
