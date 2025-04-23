package com.rensilver.api_user.controller;

import com.rensilver.api_user.dto.UserRecordDto;
import com.rensilver.api_user.entity.User;
import com.rensilver.api_user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("user/v1")
public class UserControllerImpl implements UserController{

    private final UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    @PostMapping("/user")
    public ResponseEntity<User> registerUser(@RequestBody UserRecordDto userRecordDto) {
        User user = userService.registerUser(userRecordDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @Override
    @GetMapping("/search")
    public ResponseEntity<User> findUserByEmail(@RequestParam String email) {
        return ok(userService.findUserByEmail(email));
    }

    @Override
    @GetMapping("/{userId}")
    public ResponseEntity<User> findUserById(@PathVariable String userId) {
        return ok(userService.findUserById(userId));
    }
}
