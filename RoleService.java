package com.finalassignment.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalassignment.models.Role;
import com.finalassignment.models.User;
import com.finalassignment.repository.RoleRepository;
import com.finalassignment.repository.UserRepository;
import com.finalassignment.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	// Get All Roles
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	// Get Role By Id
	public Optional<Role> findById(int id) {
		return roleRepository.findById(id);
	}

	// Delete Role
	public void delete(int id) {
		roleRepository.deleteById(id);
	}

	// Update Role
	public void save(Role Role) {
		roleRepository.save(Role);
	}

	// Assign Role to User
	public void assignUserRole(Integer userId, Integer roleId) {
		User user = userRepository.findById(userId).orElse(null);
		Role role = roleRepository.findById(roleId).orElse(null);
		Set<Role> userRoles = user.getRoles();
		userRoles.add(role);
		user.setRoles(userRoles);
		userRepository.save(user);
	}

	// Unassign Role to User
	public void unassignUserRole(Integer userId, Integer roleId) {
		User user = userRepository.findById(userId).orElse(null);
		Set<Role> userRoles = user.getRoles();

		user.getRoles().removeIf(x -> x.getId() == roleId);
		userRepository.save(user);
	}

	public Set<Role> getUserRoles(User user) {
		return user.getRoles();
	}

	public List<Role> getUserNotRoles(User user) {
		return roleRepository.getUserNotRoles(user.getId());
	}

}
