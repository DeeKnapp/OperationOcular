package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/30/17.
 */

public class LastChapter7Bankruptcy {


    private String DispositionDate;

    private String DispositionType;

    private String FiledDate;

    private String BankruptcyType;

    private int MonthsSinceDispositionDate;

    private int MonthsSinceFiledDate;


    public String getDispositionDate() {
        return DispositionDate;
    }

    public void setDispositionDate(String dispositionDate) {
        DispositionDate = dispositionDate;
    }

    public String getDispositionType() {
        return DispositionType;
    }

    public void setDispositionType(String dispositionType) {
        DispositionType = dispositionType;
    }

    public String getFiledDate() {
        return FiledDate;
    }

    public void setFiledDate(String filedDate) {
        FiledDate = filedDate;
    }

    public String getBankruptcyType() {
        return BankruptcyType;
    }

    public void setBankruptcyType(String bankruptcyType) {
        BankruptcyType = bankruptcyType;
    }

    public int getMonthsSinceDispositionDate() {
        return MonthsSinceDispositionDate;
    }

    public void setMonthsSinceDispositionDate(int monthsSinceDispositionDate) {
        MonthsSinceDispositionDate = monthsSinceDispositionDate;
    }

    public int getMonthsSinceFiledDate() {
        return MonthsSinceFiledDate;
    }

    public void setMonthsSinceFiledDate(int monthsSinceFiledDate) {
        MonthsSinceFiledDate = monthsSinceFiledDate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DispositionDate = "+DispositionDate+"," +
                " DispositionType = "+DispositionType+"," +
                " FiledDate = "+FiledDate+"," +
                " BankruptcyType = "+BankruptcyType+"," +
                " MonthsSinceDispositionDate = "+MonthsSinceDispositionDate+"," +
                " MonthsSinceFiledDate = "+MonthsSinceFiledDate+"]";
    }

}
