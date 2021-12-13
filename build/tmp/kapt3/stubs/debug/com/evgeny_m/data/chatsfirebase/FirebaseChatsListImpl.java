package com.evgeny_m.data.chatsfirebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/evgeny_m/data/chatsfirebase/FirebaseChatsListImpl;", "Lcom/evgeny_m/data/chatsfirebase/FirebaseChatsList;", "()V", "database", "Lcom/google/firebase/database/DatabaseReference;", "getDatabase", "()Lcom/google/firebase/database/DatabaseReference;", "setDatabase", "(Lcom/google/firebase/database/DatabaseReference;)V", "lastMessages", "", "Lcom/evgeny_m/data/models/DataChatsList;", "refUserMessages", "getChats", "", "data_debug"})
public final class FirebaseChatsListImpl implements com.evgeny_m.data.chatsfirebase.FirebaseChatsList {
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.database.DatabaseReference database;
    private final com.google.firebase.database.DatabaseReference refUserMessages = null;
    private java.util.List<com.evgeny_m.data.models.DataChatsList> lastMessages;
    
    public FirebaseChatsListImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.DatabaseReference getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.evgeny_m.data.models.DataChatsList> getChats() {
        return null;
    }
}