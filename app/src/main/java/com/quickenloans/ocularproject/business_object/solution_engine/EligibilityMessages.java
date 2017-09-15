package com.quickenloans.ocularproject.business_object.solution_engine;


/**
 * Created by ctan on 8/31/17.
 */

public class EligibilityMessages {

    private String Message;

    private String ActionDate;

    private int ElapsedTimeThreshold;

    private String ExpirationDate;

    private String TypeCode;

    private String Description;

    private boolean InterestRateRoundingType;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getActionDate() {
        return ActionDate;
    }

    public void setActionDate(String ActionDate) {
        this.ActionDate = ActionDate;
    }

    public int getElapsedTimeThreshold() {
        return ElapsedTimeThreshold;
    }

    public void setElapsedTimeThreshold(int ElapsedTimeThreshold) {
        this.ElapsedTimeThreshold = ElapsedTimeThreshold;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    public String getTypeCode() {
        return TypeCode;
    }

    public void setTypeCode(String TypeCode) {
        this.TypeCode = TypeCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public boolean isInterestRateRoundingType() {
        return InterestRateRoundingType;
    }

    public void setInterestRateRoundingType(boolean InterestRateRoundingType) {
        this.InterestRateRoundingType = InterestRateRoundingType;
    }
}
