package com.quickenloans.ocularproject.business_object.zillow;

import org.simpleframework.xml.Element;

public class Response {

    @Element private Results results;

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    @Override public String toString() {
        return "ClassPojo [results = " + results + "]";
    }

}
