package com.spring.cloud.secureui.repository;

public class TollData {

    private String recordId;
    private String licensePlate;
    private String timestampt;
    
    public TollData()
    {

    }

    public TollData(String recordId, String licensePlate, String timestampt) {
        this.recordId = recordId;
        this.licensePlate = licensePlate;
        this.timestampt = timestampt;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getTimestampt() {
        return timestampt;
    }

    public void setTimestampt(String timestampt) {
        this.timestampt = timestampt;
    }

    
    
}
