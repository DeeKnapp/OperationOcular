package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class ViableRules {

    private boolean IsRuleMet;

    private String Name;


    public boolean isRuleMet() {
        return IsRuleMet;
    }

    public void setRuleMet(boolean IsRuleMet) {
        this.IsRuleMet = IsRuleMet;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}
