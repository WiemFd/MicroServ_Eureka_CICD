package com.myproject.userinfo.service;

import com.myproject.userinfo.dto.UserDTO;
import com.myproject.userinfo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myproject.userinfo.repo.UserRepo;
import com.myproject.userinfo.mapper.UserMapper;

@Service
public class UserSevice {
    @Autowired
    UserRepo userRepo;

    public UserDTO addUser(UserDTO userDTO) {
        User savedUser = userRepo.save(UserMapper.INSTANCE.mapUserDTOToUser(userDTO));
        return UserMapper.INSTANCE.mapUserToUserDTO(savedUser);
    }
}
