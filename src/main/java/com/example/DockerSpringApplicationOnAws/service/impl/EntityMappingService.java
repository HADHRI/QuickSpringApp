package com.example.DockerSpringApplicationOnAws.service.impl;

import com.example.DockerSpringApplicationOnAws.dto.UserDto;
import com.example.DockerSpringApplicationOnAws.entities.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;


public interface EntityMappingService {

    UserDto getUserDtoFromUserEntity(User user);
}
