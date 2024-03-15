package org.pinsoft.interview.service;

import org.pinsoft.interview.domain.dto.UserDto;
import org.pinsoft.interview.domain.repo.UserRepository;
import org.pinsoft.interview.domain.repo.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserDto saveUser(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity = userEntity.fromDto(userDto);
        return userRepository.save(userEntity).toDto();
    }
}
