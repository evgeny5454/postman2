package com.evgeny_m.data.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.evgeny_m.data.models.User

class AuthViewModel() : ViewModel() {

    val readAllData: LiveData<List<User>>



}