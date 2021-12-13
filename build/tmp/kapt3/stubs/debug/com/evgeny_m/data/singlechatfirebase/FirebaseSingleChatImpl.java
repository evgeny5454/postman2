package com.evgeny_m.data.singlechatfirebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/evgeny_m/data/singlechatfirebase/FirebaseSingleChatImpl;", "Lcom/evgeny_m/data/singlechatfirebase/FirebaseSingleChat;", "()V", "listMessages", "", "Lcom/evgeny_m/data/models/MessageModel;", "messagesListener", "Lcom/evgeny_m/data/utils/AppValueEventListener;", "refMessages", "Lcom/google/firebase/database/DatabaseReference;", "loadMessages", "", "sendMessage", "param", "", "currentUserId", "receivingUserId", "type", "data_debug"})
public final class FirebaseSingleChatImpl implements com.evgeny_m.data.singlechatfirebase.FirebaseSingleChat {
    private com.google.firebase.database.DatabaseReference refMessages;
    private com.evgeny_m.data.utils.AppValueEventListener messagesListener;
    private java.util.List<com.evgeny_m.data.models.MessageModel> listMessages;
    
    public FirebaseSingleChatImpl() {
        super();
    }
    
    @java.lang.Override()
    public void loadMessages() {
    }
    
    @java.lang.Override()
    public void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String param, @org.jetbrains.annotations.NotNull()
    java.lang.String currentUserId, @org.jetbrains.annotations.NotNull()
    java.lang.String receivingUserId, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
}