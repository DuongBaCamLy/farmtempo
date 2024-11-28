package com.pdm.farming.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pdm.farming.Entities.Field;

@Repository
public interface FieldRepository extends JpaRepository<Field, Long> {

    // Find a Field by its ID
    Optional<Field> findByFieldId(Long fieldId);

    // Find Fields by field name
    List<Field> findByFieldNameContaining(String fieldName);

    // Find Fields by location
    List<Field> findByFieldLocationContaining(String fieldLocation);

    // Find all Fields sorted by field name in ascending order
    List<Field> findAllByOrderByFieldNameAsc();

    // Find all Fields sorted by field name in descending order
    List<Field> findAllByOrderByFieldNameDesc();

    // Find Fields where the name contains a specific keyword and are located in a given area
    List<Field> findByFieldNameContainingAndFieldLocationContaining(String fieldName, String fieldLocation);

    // Find Fields with a specific location and order them by the name
    List<Field> findByFieldLocationContainingOrderByFieldNameAsc(String fieldLocation);

    // Check if a Field with the given name exists
    boolean existsByFieldName(String fieldName);
}
