package com.rensilver.api_user.dto;

import com.rensilver.api_user.entity.Role;
import com.rensilver.api_user.enums.UserTypeEnum;

import java.util.List;

public record UserRecordDto(String firstName,
                            String lastName,
                            String email,
                            String password,
                            UserTypeEnum userType,
                            List<Role> roles) {
}
