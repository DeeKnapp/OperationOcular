package com.quickenloans.ocularproject.business_object.solution_engine;


/**
 * Created by ctan on 8/30/17.
 */

public class CollectionAccounts {

    private int NonMedicalCollectionCount;

    private Number NonMedicalCollectionBalance;

    private int MedicalCollectionCount;

    private Number MedicalCollectionBalance;

    private String MostRecentCollectionPaidOffDate;

    private int MonthsSinceMostRecentCollectionPayOff;


    public int getNonMedicalCollectionCount() {
        return NonMedicalCollectionCount;
    }

    public void setNonMedicalCollectionCount(int nonMedicalCollectionCount) {
        NonMedicalCollectionCount = nonMedicalCollectionCount;
    }

    public Number getNonMedicalCollectionBalance() {
        return NonMedicalCollectionBalance;
    }

    public void setNonMedicalCollectionBalance(Number nonMedicalCollectionBalance) {
        NonMedicalCollectionBalance = nonMedicalCollectionBalance;
    }

    public int getMedicalCollectionCount() {
        return MedicalCollectionCount;
    }

    public void setMedicalCollectionCount(int medicalCollectionCount) {
        MedicalCollectionCount = medicalCollectionCount;
    }

    public Number getMedicalCollectionBalance() {
        return MedicalCollectionBalance;
    }

    public void setMedicalCollectionBalance(Number medicalCollectionBalance) {
        MedicalCollectionBalance = medicalCollectionBalance;
    }

    public String getMostRecentCollectionPaidOffDate() {
        return MostRecentCollectionPaidOffDate;
    }

    public void setMostRecentCollectionPaidOffDate(String mostRecentCollectionPaidOffDate) {
        MostRecentCollectionPaidOffDate = mostRecentCollectionPaidOffDate;
    }

    public int getMonthsSinceMostRecentCollectionPayOff() {
        return MonthsSinceMostRecentCollectionPayOff;
    }

    public void setMonthsSinceMostRecentCollectionPayOff(int monthsSinceMostRecentCollectionPayOff) {
        MonthsSinceMostRecentCollectionPayOff = monthsSinceMostRecentCollectionPayOff;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [NonMedicalCollectionCount = "+NonMedicalCollectionCount+", " +
                "NonMedicalCollectionBalance = "+NonMedicalCollectionBalance+", " +
                "MedicalCollectionCount = "+MedicalCollectionCount+", " +
                "MedicalCollectionBalance = "+MedicalCollectionBalance+", " +
                "MostRecentCollectionPaidOffDate = "+MostRecentCollectionPaidOffDate+", " +
                "MonthsSinceMostRecentCollectionPayOff = "+MonthsSinceMostRecentCollectionPayOff+"]";
    }
}
