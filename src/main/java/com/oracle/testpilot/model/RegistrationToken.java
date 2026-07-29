/*
 ** Oracle Test Pilot
 **
 ** Copyright (c) 2025-2026 Oracle
 ** Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl/
 */
package com.oracle.testpilot.model;

/**
 * @author LLEFEVRE
 * @since 1.0.28
 */
public class RegistrationToken {
    private String token;
    private String expires_at;
    public RegistrationToken() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(String expires_at) {
        this.expires_at = expires_at;
    }

    @Override
    public String toString() {
        return "RegistrationToken{" +
                "token='" + token + '\'' +
                ", expires_at='" + expires_at + '\'' +
                '}';
    }
}
