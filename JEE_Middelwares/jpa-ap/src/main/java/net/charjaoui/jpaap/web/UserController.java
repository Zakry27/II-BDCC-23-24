package net.charjaoui.jpaap.web;

import lombok.AllArgsConstructor;
import net.charjaoui.jpaap.entities.User;
import net.charjaoui.jpaap.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> users() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{username}")
    public User user(@PathVariable String username){
        return userRepository.findByUsername(username);
    }
}