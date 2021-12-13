package com.evgeny_m.domain.repository

interface FirebaseRegistration {

    fun registerUserByPhoneNumber(phoneNumber: String)
    fun enterSmsCode(code: String)
    fun logOut()
}