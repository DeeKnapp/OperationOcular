package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class VALoanInfo {

    private String DisabilityBenfitsStatus;

    private boolean HadPriorVALoan;

    private boolean IsManufacturedHome;

    private boolean IsWithin30MilesOfMilitaryBase;

    private String ServiceType;

    public String getDisabilityBenfitsStatus() {
        return DisabilityBenfitsStatus;
    }

    public void setDisabilityBenfitsStatus(String DisabilityBenfitsStatus) {
        this.DisabilityBenfitsStatus = DisabilityBenfitsStatus;
    }

    public boolean isHadPriorVALoan() {
        return HadPriorVALoan;
    }

    public void setHadPriorVALoan(boolean HadPriorVALoan) {
        this.HadPriorVALoan = HadPriorVALoan;
    }

    public boolean isManufacturedHome() {
        return IsManufacturedHome;
    }

    public void setManufacturedHome(boolean IsManufacturedHome) {
        this.IsManufacturedHome = IsManufacturedHome;
    }

    public boolean isWithin30MilesOfMilitaryBase() {
        return IsWithin30MilesOfMilitaryBase;
    }

    public void setWithin30MilesOfMilitaryBase(boolean IsWithin30MilesOfMilitaryBase) {
        this.IsWithin30MilesOfMilitaryBase = IsWithin30MilesOfMilitaryBase;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }
}
