package com.rensilver.api_user.enums;

public enum UserTypeEnum {

    PATIENT("Basic"),
    DOCTOR("Advanced"),
    INTERNAL("Internal");

    private String userTypeName;

    UserTypeEnum(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public String getUserTypeEnum() {
        return userTypeName;
    }
}
