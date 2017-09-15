package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/30/17.
 */

public class Items {

    private String Type;

    private String DispositionType;

    private String DispositionDate;

    private boolean IsOpen;

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getDispositionType() {
        return DispositionType;
    }

    public void setDispositionType(String DispositionType) {
        this.DispositionType = DispositionType;
    }

    public String getDispositionDate() {
        return DispositionDate;
    }

    public void setDispositionDate(String DispositionDate) {
        this.DispositionDate = DispositionDate;
    }

    public boolean getIsOpen() {
        return IsOpen;
    }

    public void setIsOpen(boolean IsOpen) {
        this.IsOpen = IsOpen;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Type = "+Type+", " +
                "DispositionType = "+DispositionType+", " +
                "DispositionDate = "+DispositionDate+", " +
                "IsOpen = "+IsOpen+"]";
    }
}
