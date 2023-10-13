package com.example.backend.dtos;

import java.time.LocalDate;

public class BirdDTO {
    private String birdId;
    private String birdName;
    private Integer birdAge;
    private String status;
    private String species;
    private String cageId;
    private Integer foodQuantity;
    private String periodId;
    private Boolean birdGender;
    private LocalDate hatchingDate;
    private String birdImage;
    public BirdDTO() {
    }

    public BirdDTO(String birdId, String birdName, Integer birdAge, String status, String species, String cageId, Integer foodQuantity, String periodId, Boolean birdGender, LocalDate hatchingDate,String birdImage) {
        this.birdId = birdId;
        this.birdName = birdName;
        this.birdAge = birdAge;
        this.status = status;
        this.species = species;
        this.cageId = cageId;
        this.foodQuantity = foodQuantity;
        this.periodId = periodId;
        this.birdGender = birdGender;
        this.hatchingDate = hatchingDate;
        this.birdImage = birdImage;
    }

    public String getBirdId() {
        return birdId;
    }

    public void setBirdId(String birdId) {
        this.birdId = birdId;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public Integer getBirdAge() {
        return birdAge;
    }

    public void setBirdAge(Integer birdAge) {
        this.birdAge = birdAge;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getCageId() {
        return cageId;
    }

    public void setCageId(String cageId) {
        this.cageId = cageId;
    }

    public Integer getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(Integer foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public String getPeriodId() {
        return periodId;
    }

    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }

    public Boolean getBirdGender() {
        return birdGender;
    }

    public void setBirdGender(Boolean birdGender) {
        this.birdGender = birdGender;
    }

    public LocalDate getHatchingDate() {
        return hatchingDate;
    }

    public void setHatchingDate(LocalDate hatchingDate) {
        this.hatchingDate = hatchingDate;
    }
}
