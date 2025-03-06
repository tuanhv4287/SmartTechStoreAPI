package com.project.shopapp.services;

import com.project.shopapp.dtos.UpdateUserDTO;
import com.project.shopapp.dtos.UserDTO;
import com.project.shopapp.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {
    User createUser(UserDTO userDTO) throws Exception;
    User updateUser(Long userId, UpdateUserDTO updatedUserDTO) throws Exception;
    User getUserDetailsFromToken(String token) throws Exception;
    void deleteUser(Long id);
    Page<User> getUserByKeyword(String keyword, Pageable pageable);
    String login(String phoneNumber, String password, Long role_id) throws Exception;
}
