package com.rensilver.api_login.enums;

public enum RoleEnum {

    PATIENT("Patient"),
    DOCTOR("Doctor"),
    ADMIN("Administration");

    private String roleName;

    RoleEnum(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
