package com.pdm.farming.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdm.farming.Entities.Farmer;


public interface FarmerRepository extends JpaRepository<Farmer, Long> {
 // Find a Field by its ID
    Optional<Farmer> findByFarmerId(Long farmerid);


    List<Farmer> findByLastNameContaining(String LastName);

    // Find Fields by location (e.g., "West Side")
    List<Farmer> findByFarmLocationContaining(String farmLocation);

}

