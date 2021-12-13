package com.evgeny_m.data.localstorage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/evgeny_m/data/localstorage/SharedPrefUserStorage;", "Lcom/evgeny_m/data/localstorage/UserStorage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getUserData", "Lcom/evgeny_m/data/models/DataUserModel;", "saveUserData", "", "data", "data_debug"})
public final class SharedPrefUserStorage implements com.evgeny_m.data.localstorage.UserStorage {
    private final android.content.SharedPreferences sharedPreferences = null;
    
    public SharedPrefUserStorage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny_m.data.models.DataUserModel getUserData() {
        return null;
    }
    
    @java.lang.Override()
    public boolean saveUserData(@org.jetbrains.annotations.NotNull()
    com.evgeny_m.data.models.DataUserModel data) {
        return false;
    }
}