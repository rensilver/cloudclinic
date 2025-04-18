package com.rensilver.api_login.dto;

import com.rensilver.api_login.entity.Role;
import com.rensilver.api_login.enums.UserTypeEnum;

import java.util.List;

public record UserRecordDto(String firstName,
                            String lastName,
                            String email,
                            String password,
                            UserTypeEnum userType,
                            List<Role> roles) {
}
