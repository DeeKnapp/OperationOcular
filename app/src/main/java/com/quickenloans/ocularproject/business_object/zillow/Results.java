package com.quickenloans.ocularproject.business_object.zillow;

import org.simpleframework.xml.Element;

public class Results {

    @Element private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

}
