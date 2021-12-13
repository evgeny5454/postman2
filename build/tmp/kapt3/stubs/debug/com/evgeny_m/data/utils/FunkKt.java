package com.evgeny_m.data.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"FROM", "", "MESSAGE_KEY", "MESSAGE_TYPE", "NODE_MESSAGES", "SERVER_TIME_STAMP", "TEXT", "database", "Lcom/google/firebase/database/DatabaseReference;", "getDatabase", "()Lcom/google/firebase/database/DatabaseReference;", "sendSingleMessage", "", "param", "currentUserId", "receivingUserId", "type", "getMessageModel", "Lcom/evgeny_m/data/models/MessageModel;", "Lcom/google/firebase/database/DataSnapshot;", "data_debug"})
public final class FunkKt {
    @org.jetbrains.annotations.NotNull()
    private static final com.google.firebase.database.DatabaseReference database = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NODE_MESSAGES = "messages";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FROM = "from";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MESSAGE_TYPE = "type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEXT = "messageText";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MESSAGE_KEY = "messageKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVER_TIME_STAMP = "serverTimeStamp";
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.firebase.database.DatabaseReference getDatabase() {
        return null;
    }
    
    public static final void sendSingleMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String param, @org.jetbrains.annotations.NotNull()
    java.lang.String currentUserId, @org.jetbrains.annotations.NotNull()
    java.lang.String receivingUserId, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.evgeny_m.data.models.MessageModel getMessageModel(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot $this$getMessageModel) {
        return null;
    }
}