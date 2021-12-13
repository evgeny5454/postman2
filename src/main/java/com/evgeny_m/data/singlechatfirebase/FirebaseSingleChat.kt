package com.evgeny_m.data.singlechatfirebase

interface FirebaseSingleChat {

    fun sendMessage(param: String, currentUserId: String, receivingUserId: String, type: String)
   fun loadMessages()
}