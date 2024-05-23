package com.example.coin.repository;

import com.example.coin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository <User, UUID> {
}
