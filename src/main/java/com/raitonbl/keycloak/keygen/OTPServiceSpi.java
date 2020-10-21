package com.raitonbl.keycloak.keygen;

import org.keycloak.provider.Provider;
import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.Spi;

public class OTPServiceSpi implements Spi {

    @Override
    public boolean isInternal() {
        return Boolean.FALSE;
    }

    @Override
    public String getName() {
        return "one-time-pin";
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        return OTPService.class;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return OTPServiceFactory.class;
    }

}
