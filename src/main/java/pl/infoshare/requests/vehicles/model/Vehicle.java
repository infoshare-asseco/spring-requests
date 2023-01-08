package pl.infoshare.requests.vehicles.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Vehicle {
    private Integer id;
    private VehicleType type;
    private BigDecimal mileage;
    private String registrationNumber;
    private LocalDate lastReviewDate;
    private BigDecimal lastReviewMileage;
    private String city;

    public Vehicle(Integer id, VehicleType type, BigDecimal mileage, String registrationNumber, LocalDate lastReviewDate, BigDecimal lastReviewMileage, String city) {
        this.id = id;
        this.type = type;
        this.mileage = mileage;
        this.registrationNumber = registrationNumber;
        this.lastReviewDate = lastReviewDate;
        this.lastReviewMileage = lastReviewMileage;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public VehicleType getType() {
        return type;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public LocalDate getLastReviewDate() {
        return lastReviewDate;
    }

    public BigDecimal getLastReviewMileage() {
        return lastReviewMileage;
    }

    public String getCity() {
        return city;
    }

    public Vehicle setId(Integer id) {
        this.id = id;
        return this;
    }

    public Vehicle setType(VehicleType type) {
        this.type = type;
        return this;
    }

    public Vehicle setMileage(BigDecimal mileage) {
        this.mileage = mileage;
        return this;
    }

    public Vehicle setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    public Vehicle setLastReviewDate(LocalDate lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
        return this;
    }

    public Vehicle setLastReviewMileage(BigDecimal lastReviewMileage) {
        this.lastReviewMileage = lastReviewMileage;
        return this;
    }

    public Vehicle setCity(String city) {
        this.city = city;
        return this;
    }
}
