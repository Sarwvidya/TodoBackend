package com.springboot.todo.entity;

import jakarta.persistence.Embeddable;
import org.springframework.security.core.GrantedAuthority;

@Embeddable
public class Authority implements GrantedAuthority {

    private String authority;

    private Authority(){};

    public Authority(String roleEmployee){ }

    @Override
    public String getAuthority() {
        return "";
    }
}
