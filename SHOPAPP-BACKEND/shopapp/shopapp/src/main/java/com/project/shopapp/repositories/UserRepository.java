package com.project.shopapp.repositories;

import com.project.shopapp.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByPhoneNumber(String phoneNumber);

    Optional<User> findByPhoneNumber(String phoneNumber);
    @Query("SELECT u FROM User u WHERE u.active = false AND u.fullName LIKE %:keyword% OR u.phoneNumber LIKE %:keyword%")
    Page<User> findByKeyword(String keyword, Pageable pageable);
}
