package com.rensilver.api_user.controller;

import com.rensilver.api_user.dto.UserRecordDto;
import com.rensilver.api_user.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserController {

    ResponseEntity<User> registerUser(@RequestBody UserRecordDto userRecordDto);

    ResponseEntity<User> findUserByEmail(@RequestParam String email);

    ResponseEntity<User> findUserById(@PathVariable String userId);
}
