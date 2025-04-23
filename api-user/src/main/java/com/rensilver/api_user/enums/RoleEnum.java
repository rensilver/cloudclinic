package com.rensilver.api_user.enums;

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
