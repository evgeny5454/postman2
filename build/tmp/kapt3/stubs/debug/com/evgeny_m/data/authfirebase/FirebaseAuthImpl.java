package com.evgeny_m.data.authfirebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/evgeny_m/data/authfirebase/FirebaseAuthImpl;", "Lcom/evgeny_m/data/authfirebase/FirebaseAuthInterface;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "callbacks", "Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;", "authUser", "", "phoneNumber", "", "data_debug"})
public final class FirebaseAuthImpl implements com.evgeny_m.data.authfirebase.FirebaseAuthInterface {
    private final android.app.Activity activity = null;
    private com.google.firebase.auth.FirebaseAuth auth;
    private com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks callbacks;
    
    public FirebaseAuthImpl(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @java.lang.Override()
    public void authUser(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber) {
    }
}