package com.example.myproject;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.InetAddress;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ConfigurationProperties("my.service")
 class ConfigProprties {
    private boolean enabled;
    private InetAddress remoteAddress;
    private final Security security = new Security();
    public boolean isEnabled() {
        return this.enabled;
    }
    public void setEnabled(boolean enabled) {

        this.enabled = enabled;

    }
    public InetAddress getRemoteAddress() {
        return this.remoteAddress;
    }
    public void setRemoteAddress(InetAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }
    public Security getSecurity() {
        return this.security;
    }
    public static class Security {
        private String username;
        private String password;
        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));
        public String getUsername() {
            return this.username;
        }
        public void setUsername(String username) {
            this.username = username;
        }
        public String getPassword() {
            return this.password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public List<String> getRoles() {
            return this.roles;
        }
        public void setRoles(List<String> roles) {
            this.roles = roles;
        }
    }
}