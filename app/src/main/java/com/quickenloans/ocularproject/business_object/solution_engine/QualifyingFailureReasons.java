package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class QualifyingFailureReasons {

    private String Code;

    private String Description;

    private String ActionDate;

    private String ExpirationDate;

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getActionDate() {
        return ActionDate;
    }

    public void setActionDate(String ActionDate) {
        this.ActionDate = ActionDate;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }
}
