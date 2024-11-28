package com.pdm.farming.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pdm.farming.Entities.Soil;

@Repository
public interface SoilRepository extends JpaRepository<Soil, Long> {
    
    // Custom query method to find soils by pH level
    List<Soil> findBypHLevel(Double pHLevel);

    // Custom query method to find a soil record by Field ID
    Soil findByField_FieldId(Long fieldId);

    // Custom query method to find all soils with moisture level greater than a specific value
    List<Soil> findByMoistureLevelGreaterThan(Double moistureLevel);

    // Custom query method to find all soils recorded after a specific date
    List<Soil> findByRecordAtAfter(LocalDateTime dateTime);

    // Custom query method to find soils by soil temperature
    List<Soil> findBySoilTemperature(Double soilTemperature);

    // Custom query method to find soils by soil temperature within a range
    List<Soil> findBySoilTemperatureBetween(Double minTemp, Double maxTemp);

    // Custom query method to find soils by moisture level
    List<Soil> findByMoistureLevel(Double moistureLevel);

    // Custom query method to find soils by pH level within a range
    List<Soil> findBypHLevelBetween(Double minPH, Double maxPH);

    // Custom query method to find soils recorded at a specific time
    List<Soil> findByRecordAt(LocalDateTime recordAt);

    // Custom query method to find soils where the record time is before a certain timestamp
    List<Soil> findByRecordAtBefore(LocalDateTime dateTime);
}
