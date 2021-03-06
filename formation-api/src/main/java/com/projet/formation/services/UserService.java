package com.projet.formation.services;


import com.projet.formation.dto.AjoutResponse;
import com.projet.formation.dto.LoginDto;
import com.projet.formation.models.User;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> getAllUsers(String login);
    //AjoutResponse addUserDto(UserDto user);
    // AjoutResponse addUser(User user);
    AjoutResponse addOrUpdateUser(User user);

    User getUserByLogin(String login);

    Boolean verifyPassword(LoginDto loginDto);

    Boolean checkPassword(String pwdUser, String passwordToCheck);

    User getUserById(Long id);

    AjoutResponse deleteUser(long id);

}
