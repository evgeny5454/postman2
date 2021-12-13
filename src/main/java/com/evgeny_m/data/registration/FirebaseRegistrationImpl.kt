package com.evgeny_m.data.registration

import android.app.Activity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.evgeny_m.data.room.UserDao
import com.evgeny_m.domain.repository.FirebaseRegistration
import com.google.firebase.FirebaseException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthOptions
import com.google.firebase.auth.PhoneAuthProvider
import java.util.concurrent.TimeUnit

private var mutableRegister = MutableLiveData<Boolean>()
var register: LiveData<Boolean> = mutableRegister

private var mutableCurrentUserId = MutableLiveData<String>()
var currentUserId: LiveData<String> = mutableCurrentUserId


class FirebaseRegistrationImpl(private val activity: Activity) : FirebaseRegistration {

    private lateinit var auth: FirebaseAuth
    private lateinit var callbacks: PhoneAuthProvider.OnVerificationStateChangedCallbacks
    private lateinit var verificationId: String

    init {
        auth = FirebaseAuth.getInstance()
        mutableCurrentUserId.value = auth.currentUser?.uid.toString()
    }

    override fun registerUserByPhoneNumber(phoneNumber: String) {

        callbacks = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            override fun onVerificationCompleted(credential: PhoneAuthCredential) {
                mutableRegister.value = true
            }

            override fun onVerificationFailed(exeptionMessage: FirebaseException) {

            }

            override fun onCodeSent(
                id: String,
                token: PhoneAuthProvider.ForceResendingToken
            ) {
                verificationId = id
            }
        }


        val option = PhoneAuthOptions.newBuilder()
            .setPhoneNumber(phoneNumber)
            .setTimeout(120L, TimeUnit.SECONDS)
            .setActivity(activity)
            .setCallbacks(callbacks)
            .build()
        PhoneAuthProvider.verifyPhoneNumber(option)
    }

    override fun enterSmsCode(code: String) {
        val credential = PhoneAuthProvider.getCredential(verificationId, code)
        auth.signInWithCredential(credential).addOnCompleteListener {
            mutableCurrentUserId.value = auth.currentUser?.uid.toString()
            //mutableRegister.value = true
        }.addOnFailureListener {
            mutableRegister.value = false
        }
    }

    override fun logOut() {
        auth.signOut()
        mutableCurrentUserId.value = null
    }
}