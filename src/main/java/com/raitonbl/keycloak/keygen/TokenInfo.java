package com.raitonbl.keycloak.keygen;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TokenInfo implements Serializable {

    private String id;
    private int count;
    private String type;
    private String code;
    private String userID;
    private Long expiresIn;
    private LocalDateTime createdAt;

    public String getId() {
        return this.id;
    }

    
    public String getCode() {
        return this.code;
    }

    
    public String getUserID() {
        return this.userID;
    }

    
    public String getType() {
        return this.type;
    }

    
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    
    public int getAttemptCount() {
        return this.count;
    }

    
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAttemptCount(int count) {
        this.count = count;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public TokenInfo copy() {

        TokenInfo instance = new TokenInfo();

        instance.id = id;
        instance.type = type;
        instance.code = code;
        instance.count = count;
        instance.userID = userID;
        instance.expiresIn = expiresIn;
        instance.createdAt = createdAt;
        return instance;
    }
    
}
