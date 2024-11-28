package com.pdm.farming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pdm.farming.Entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    // Optional: You can add custom queries here if needed
    Admin findByUsername(String username);
}
