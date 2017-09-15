package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class Scenarios {

    private boolean IsDefaultScenarioIncluded;

    private boolean IsDefaultScenarioSelected;

    private ScenarioList[] ScenarioList;

    public boolean isDefaultScenarioIncluded() {
        return IsDefaultScenarioIncluded;
    }

    public void setDefaultScenarioIncluded(boolean IsDefaultScenarioIncluded) {
        this.IsDefaultScenarioIncluded = IsDefaultScenarioIncluded;
    }

    public boolean isDefaultScenarioSelected() {
        return IsDefaultScenarioSelected;
    }

    public void setDefaultScenarioSelected(boolean IsDefaultScenarioSelected) {
        this.IsDefaultScenarioSelected = IsDefaultScenarioSelected;
    }

    public ScenarioList[] getScenarioList() {
        return ScenarioList;
    }

    public void setScenarioList(ScenarioList[] ScenarioList) {
        this.ScenarioList = ScenarioList;
    }
}
