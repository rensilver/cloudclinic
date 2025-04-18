package com.rensilver.api_login.enums;

public enum RoleEnum {

    BASIC("Basic"),
    ADVANCED("Advanced"),
    ADMIN("Administration");

    private String roleName;

    RoleEnum(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
