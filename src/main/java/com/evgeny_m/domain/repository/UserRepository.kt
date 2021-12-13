package com.evgeny_m.domain.repository

import com.evgeny_m.domain.models.DomainUserModel

interface UserRepository {


    fun getUserData() : DomainUserModel
    fun saveUserData(saveParam: DomainUserModel): Boolean
    //fun getChats() : List<DomainChatModel>
}