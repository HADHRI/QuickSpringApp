package com.example.DockerSpringApplicationOnAws.controller;


import com.example.DockerSpringApplicationOnAws.dto.UserDto;
import com.example.DockerSpringApplicationOnAws.repositories.UserRepository;
import com.example.DockerSpringApplicationOnAws.service.impl.EntityMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/")
public class UserController {

    private final UserRepository userRepository;
    private final EntityMappingService entityMappingService;

    @Autowired
    public UserController(UserRepository userRepository, EntityMappingService entityMappingService) {
        this.userRepository = userRepository;
        this.entityMappingService = entityMappingService;
    }

    @GetMapping(value = "/user/{id}")
    public UserDto getUserbyId(@PathVariable("id") Integer id) {
        return entityMappingService.getUserDtoFromUserEntity(userRepository.findById(id).orElse(null));
    }
}
