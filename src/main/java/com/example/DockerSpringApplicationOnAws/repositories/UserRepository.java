package com.example.DockerSpringApplicationOnAws.repositories;

import com.example.DockerSpringApplicationOnAws.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer> {
}
