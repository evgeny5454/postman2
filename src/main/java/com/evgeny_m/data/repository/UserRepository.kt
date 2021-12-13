package com.evgeny_m.data.repository

import androidx.lifecycle.LiveData
import com.evgeny_m.data.models.User
import com.evgeny_m.data.room.UserDao

class UserRepository(private val userDao: UserDao) {

    val readAllData : LiveData<List<User>> =userDao.readAllData()

    suspend fun addUser(user: User) {
        userDao.addUser(user)
    }

    suspend fun updateUser(user: User) {
        userDao.updateUser(user)
    }
}