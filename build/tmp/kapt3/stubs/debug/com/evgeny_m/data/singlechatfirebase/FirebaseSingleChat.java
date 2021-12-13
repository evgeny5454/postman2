package com.evgeny_m.data.singlechatfirebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H&\u00a8\u0006\n"}, d2 = {"Lcom/evgeny_m/data/singlechatfirebase/FirebaseSingleChat;", "", "loadMessages", "", "sendMessage", "param", "", "currentUserId", "receivingUserId", "type", "data_debug"})
public abstract interface FirebaseSingleChat {
    
    public abstract void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String param, @org.jetbrains.annotations.NotNull()
    java.lang.String currentUserId, @org.jetbrains.annotations.NotNull()
    java.lang.String receivingUserId, @org.jetbrains.annotations.NotNull()
    java.lang.String type);
    
    public abstract void loadMessages();
}