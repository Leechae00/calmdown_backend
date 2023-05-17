package com.example.calmdown.controller;

import com.example.calmdown.dto.UserRequest;
import com.example.calmdown.dto.UserResponse;
import com.example.calmdown.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor /** 의존성 주입 **/
public class UserApiController {

    private final UserService userService;

    /** User 정보를 데이터베이스에 저장**/
    @PostMapping("/user")
    public ResponseEntity<UserRequest> create(@RequestBody UserRequest userRequest){
        userService.create(userRequest);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @GetMapping("/user")
    public ResponseEntity<UserResponse> read(@RequestParam Long userID){
        UserResponse userResponse = userService.read(userID);
        return (userResponse != null) ?
                ResponseEntity.status(HttpStatus.OK).body(userResponse) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
}

/**
 * 2xx : 요청이 성공적이야!!
 * 4xx : 클라이언트가 문제야!!
 * 5xx : 서버가 문제야!!
 * **/