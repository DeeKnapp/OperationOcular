package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class PropertiesOwned {

    private String Address1;

    private String Address2;

    private String City;

    private String Zip;

    private String State;

    private String County;

    private String CountyFIPS;

    private Number AnnualTaxAmount;

    private Number AnnualInsuranceAmount;

    private String OccupancyType;

    private String PropertyType;

    private int NumberOfUnits;

    private int HomeValueAmount;

    private int PropertySquareFootage;

    private int FamilySize;

    private boolean IsSubjectProperty;

    private Liens Liens;

    private Number MonthlyRentalIncome;

    private Number HomeownersAssociationDues;

    private boolean EscrowsCurrentlyWaived;

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String Address1) {
        this.Address1 = Address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String Address2) {
        this.Address2 = Address2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String Zip) {
        this.Zip = Zip;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String County) {
        this.County = County;
    }

    public String getCountyFIPS() {
        return CountyFIPS;
    }

    public void setCountyFIPS(String CountyFIPS) {
        this.CountyFIPS = CountyFIPS;
    }

    public Number getAnnualTaxAmount() {
        return AnnualTaxAmount;
    }

    public void setAnnualTaxAmount(Number AnnualTaxAmount) {
        this.AnnualTaxAmount = AnnualTaxAmount;
    }

    public Number getAnnualInsuranceAmount() {
        return AnnualInsuranceAmount;
    }

    public void setAnnualInsuranceAmount(Number AnnualInsuranceAmount) {
        this.AnnualInsuranceAmount = AnnualInsuranceAmount;
    }

    public String getOccupancyType() {
        return OccupancyType;
    }

    public void setOccupancyType(String OccupancyType) {
        this.OccupancyType = OccupancyType;
    }

    public String getPropertyType() {
        return PropertyType;
    }

    public void setPropertyType(String PropertyType) {
        this.PropertyType = PropertyType;
    }

    public int getNumberOfUnits() {
        return NumberOfUnits;
    }

    public void setNumberOfUnits(int NumberOfUnits) {
        this.NumberOfUnits = NumberOfUnits;
    }

    public int getHomeValueAmount() {
        return HomeValueAmount;
    }

    public void setHomeValueAmount(int HomeValueAmount) {
        this.HomeValueAmount = HomeValueAmount;
    }

    public int getPropertySquareFootage() {
        return PropertySquareFootage;
    }

    public void setPropertySquareFootage(int PropertySquareFootage) {
        this.PropertySquareFootage = PropertySquareFootage;
    }

    public int getFamilySize() {
        return FamilySize;
    }

    public void setFamilySize(int FamilySize) {
        this.FamilySize = FamilySize;
    }

    public boolean isSubjectProperty() {
        return IsSubjectProperty;
    }

    public void setSubjectProperty(boolean IsSubjectProperty) {
        this.IsSubjectProperty = IsSubjectProperty;
    }

    public Liens getLiens() {
        return Liens;
    }

    public void setLiens(Liens liens) {
        this.Liens = Liens;
    }

    public Number getMonthlyRentalIncome() {
        return MonthlyRentalIncome;
    }

    public void setMonthlyRentalIncome(Number MonthlyRentalIncome) {
        this.MonthlyRentalIncome = MonthlyRentalIncome;
    }

    public Number getHomeownersAssociationDues() {
        return HomeownersAssociationDues;
    }

    public void setHomeownersAssociationDues(Number HomeownersAssociationDues) {
        this.HomeownersAssociationDues = HomeownersAssociationDues;
    }

    public boolean isEscrowsCurrentlyWaived() {
        return EscrowsCurrentlyWaived;
    }

    public void setEscrowsCurrentlyWaived(boolean EscrowsCurrentlyWaived) {
        this.EscrowsCurrentlyWaived = EscrowsCurrentlyWaived;
    }
}
