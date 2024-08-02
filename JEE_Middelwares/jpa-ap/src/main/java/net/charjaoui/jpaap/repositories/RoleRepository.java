package net.charjaoui.jpaap.repositories;

import net.charjaoui.jpaap.entities.Role;
import net.charjaoui.jpaap.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findRoleByRoleName(String roleName);
}