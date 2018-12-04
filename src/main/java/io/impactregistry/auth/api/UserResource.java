package io.impactregistry.auth.api;

import io.impactregistry.auth.dto.ImpactregistryUserDto;
import io.impactregistry.auth.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    private UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody ImpactregistryUserDto impactregistryUserDto) {
        userService.saveUser(impactregistryUserDto);
    }
}
