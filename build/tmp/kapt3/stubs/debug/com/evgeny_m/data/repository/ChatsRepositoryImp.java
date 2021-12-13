package com.evgeny_m.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/evgeny_m/data/repository/ChatsRepositoryImp;", "Lcom/evgeny_m/domain/repository/ChatsRepository;", "chatsStorage", "Lcom/evgeny_m/data/chatsfirebase/FirebaseChatsListImpl;", "(Lcom/evgeny_m/data/chatsfirebase/FirebaseChatsListImpl;)V", "getChats", "", "Lcom/evgeny_m/domain/models/DomainChatModel;", "mapChatToDomain", "chat", "Lcom/evgeny_m/data/models/DataChatsList;", "data_debug"})
public final class ChatsRepositoryImp implements com.evgeny_m.domain.repository.ChatsRepository {
    private final com.evgeny_m.data.chatsfirebase.FirebaseChatsListImpl chatsStorage = null;
    
    public ChatsRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.evgeny_m.data.chatsfirebase.FirebaseChatsListImpl chatsStorage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.evgeny_m.domain.models.DomainChatModel> getChats() {
        return null;
    }
    
    private final java.util.List<com.evgeny_m.domain.models.DomainChatModel> mapChatToDomain(java.util.List<com.evgeny_m.data.models.DataChatsList> chat) {
        return null;
    }
}