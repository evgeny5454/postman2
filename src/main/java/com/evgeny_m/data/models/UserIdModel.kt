package com.evgeny_m.data.models

data class UserIdModel(
    val userId: String = ""
)

data class UserMessageModel(
    val from: String = "",
    var messageText: String = "",
    var messageKey: String = "",
    var serverTimeStamp: Long = 0,
    var type: String = "",
)
