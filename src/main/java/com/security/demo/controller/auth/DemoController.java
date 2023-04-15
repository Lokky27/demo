package com.security.demo.controller.auth;

import com.security.demo.model.User;
import com.security.demo.service.UserService;
import com.security.demo.service.security.model.PageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
@RequiredArgsConstructor
public class DemoController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello");
    }

    @GetMapping("/page")
    public PageResponse<User> getPage(
            @RequestParam int pageNumber,
            @RequestParam int pageSize) {
        return userService.getPage(pageNumber, pageSize);
    }
}
