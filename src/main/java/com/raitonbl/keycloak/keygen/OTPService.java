package com.raitonbl.keycloak.keygen;

import org.keycloak.provider.Provider;

import java.util.Optional;

public interface OTPService extends Provider {

    void registerAttempt(String id, String type);

    Optional<TokenInfo> get(String id, String type);

    void invalidate(String id, String type, Cause cause);

    TokenInfo create(String userID, String type, long expiresIn) throws TokenException;

}
