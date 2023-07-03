package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.Set;

public interface RoleService {

    Role getRoleById(Long id);

    Set<Role> getAllRoles();

    void addRole(Role role);

}
