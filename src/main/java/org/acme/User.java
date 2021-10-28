package org.acme;

import io.quarkus.security.identity.SecurityIdentity;

public class User {
    
    private final String username;

    public User(SecurityIdentity identity) {
        this.username = identity.getPrincipal().getName();
    }

    public String getUsername() {
        return username;
    }
}
