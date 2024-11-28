package com.pdm.farming.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "weather")
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "weather_id")
    private Long weatherId;

    @Column(name = "temperature")
    private Double temperature;

    @Column(name = "humidity")
    private Double humidity;

    @Column(name = "pressure")
    private Double pressure;

    @Column(name = "wind_speed")
    private Double windSpeed;

    @Column(name = "record_at")
    private LocalDateTime recordAt;

    @ManyToOne
    @JoinColumn(name = "farmer_id")
    private Farmer farmer;

     // Getters and Setters
     public Long getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(Long weatherId) {
        this.weatherId = weatherId;
    }

    public Double setTemperature(){
        return temperature;
    }
    public void setTemperature(Double temperature){
        this.temperature=temperature;
    }
    public Double getHumidity(){
        return humidity;
    }
    public void setHumidity(Double humidity){
        this.humidity=humidity;
    }
    public Double getPressure(){
        return pressure;
    }
    public void setPressure(Double pressure){
        this.pressure=pressure;
    }
    public Double getWindSpeed(){
        return windSpeed;
    }
    public void setWindSpeed(Double windSpeed){
        this.windSpeed=windSpeed;
    }
    public LocalDateTime getRecordAt(){
        return recordAt;
    }
    public void setRecordAt(LocalDateTime recordAt){
        this.recordAt=recordAt;
    }
    
    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }
    // (Generated code omitted for brevity)
}
