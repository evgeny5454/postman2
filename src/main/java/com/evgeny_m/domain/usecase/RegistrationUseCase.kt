package com.evgeny_m.domain.usecase

import com.evgeny_m.domain.repository.FirebaseRegistration

class RegistrationUseCase(private val firebaseRegistration: FirebaseRegistration) {

    fun enterPhoneNumber(phoneNumber: String) {
        firebaseRegistration.registerUserByPhoneNumber(phoneNumber)
    }
    fun enterSmsCode(code: String) {
        firebaseRegistration.enterSmsCode(code)
    }
    fun logOut(){
        firebaseRegistration.logOut()
    }
}