package com.example.DockerSpringApplicationOnAws.service.impl;

import com.example.DockerSpringApplicationOnAws.dto.UserDto;
import com.example.DockerSpringApplicationOnAws.entities.User;
import org.springframework.stereotype.Service;


@Service
public class EntityMappingServiceImpl implements EntityMappingService {

    @Override
    public UserDto getUserDtoFromUserEntity(final User user) {
        return user != null ? UserDto.builder().email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName()).build() : null;
    }
}
