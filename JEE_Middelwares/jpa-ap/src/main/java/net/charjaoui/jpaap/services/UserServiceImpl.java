package net.charjaoui.jpaap.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import net.charjaoui.jpaap.entities.Role;
import net.charjaoui.jpaap.entities.User;
import net.charjaoui.jpaap.repositories.RoleRepository;
import net.charjaoui.jpaap.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@Transactional
@AllArgsConstructor //only one constructor for dependency injection
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;


    @Override
    public User addNewUser(User user) {
        user.setId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Role findRoleByName(String name) {
        return roleRepository.findRoleByRoleName(name);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = findUserByUsername(username);
        Role role = findRoleByName(roleName);
        if (user.getRoles() != null) {
            user.getRoles().add(role);
            role.getUsers().add(user);
        }
    }

    @Override
    public User authenticate(String username, String password) {
        User user = findUserByUsername(username);
        if (user == null || !user.getPassword().equals(password)) throw new RuntimeException("Bad credentials");
        return user;
    }
}
