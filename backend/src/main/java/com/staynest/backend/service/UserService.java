package com.staynest.backend.service;


import com.staynest.backend.dto.ProfileUpdateRequestDto;
import com.staynest.backend.dto.UserDto;
import com.staynest.backend.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
