package com.quickenloans.ocularproject.business_object.zillow;

import org.simpleframework.xml.Element;

public class Example {

    @Element private SearchResults searchresults;

    public SearchResults getSearchResults() {
        return searchresults;
    }

    public void setSearchresults(SearchResults searchresults) {
        this.searchresults = searchresults;
    }

}
