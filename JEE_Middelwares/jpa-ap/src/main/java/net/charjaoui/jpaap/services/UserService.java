package net.charjaoui.jpaap.services;

import net.charjaoui.jpaap.entities.Role;
import net.charjaoui.jpaap.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUsername(String username);
    Role findRoleByName(String name);
    void addRoleToUser(String username, String roleName);

    User authenticate(String username, String password);
}