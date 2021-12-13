package com.evgeny_m.data.localstorage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/evgeny_m/data/localstorage/UserStorage;", "", "getUserData", "Lcom/evgeny_m/data/models/DataUserModel;", "saveUserData", "", "data", "data_debug"})
public abstract interface UserStorage {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny_m.data.models.DataUserModel getUserData();
    
    public abstract boolean saveUserData(@org.jetbrains.annotations.NotNull()
    com.evgeny_m.data.models.DataUserModel data);
}