package com.secu1.phising1.repository;

import com.secu1.phising1.model.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity,String> {
    Optional<UsersEntity> findByUsername(String username);
}
