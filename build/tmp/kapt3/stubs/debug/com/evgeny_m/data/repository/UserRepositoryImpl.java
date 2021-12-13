package com.evgeny_m.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/evgeny_m/data/repository/UserRepositoryImpl;", "Lcom/evgeny_m/domain/repository/UserRepository;", "userStorage", "Lcom/evgeny_m/data/localstorage/UserStorage;", "(Lcom/evgeny_m/data/localstorage/UserStorage;)V", "getUserData", "Lcom/evgeny_m/domain/models/DomainUserModel;", "mapToDomain", "dataUserModel", "Lcom/evgeny_m/data/models/DataUserModel;", "mapToStorage", "saveParam", "saveUserData", "", "data_debug"})
public final class UserRepositoryImpl implements com.evgeny_m.domain.repository.UserRepository {
    private final com.evgeny_m.data.localstorage.UserStorage userStorage = null;
    
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.evgeny_m.data.localstorage.UserStorage userStorage) {
        super();
    }
    
    @java.lang.Override()
    public boolean saveUserData(@org.jetbrains.annotations.NotNull()
    com.evgeny_m.domain.models.DomainUserModel saveParam) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny_m.domain.models.DomainUserModel getUserData() {
        return null;
    }
    
    private final com.evgeny_m.data.models.DataUserModel mapToStorage(com.evgeny_m.domain.models.DomainUserModel saveParam) {
        return null;
    }
    
    private final com.evgeny_m.domain.models.DomainUserModel mapToDomain(com.evgeny_m.data.models.DataUserModel dataUserModel) {
        return null;
    }
}