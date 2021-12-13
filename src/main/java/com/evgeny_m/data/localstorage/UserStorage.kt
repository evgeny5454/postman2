package com.evgeny_m.data.localstorage

import com.evgeny_m.data.models.DataUserModel

interface UserStorage {

    fun getUserData(): DataUserModel
    fun saveUserData(data: DataUserModel): Boolean
}