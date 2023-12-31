package ru.kata.spring.boot_security.demo.services;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.Role;

import java.util.Set;
@Service
public interface RoleService {

    Role getRoleById(Long id);

    Set<Role> getAllRoles();

    void addRole(Role role);

}
