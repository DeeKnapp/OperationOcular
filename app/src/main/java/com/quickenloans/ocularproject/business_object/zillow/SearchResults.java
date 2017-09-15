package com.quickenloans.ocularproject.business_object.zillow;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


@Root(name = "SearchResults:searchresults")
public class SearchResults {

    @Attribute(name = "schemaLocation")
    @Namespace(reference = "http://www.zillow.com/static/xsd/SearchResults.xsd /vstatic/ae1bf8a790b67ef2e902d2bc04046f02/static/xsd/SearchResults.xsd", prefix = "xsi")
    private String mSchemaLocation;

    public SearchResults() {
        setSchemaLocation("http://www.zillow.com/static/xsd/SearchResults.xsd /vstatic/ae1bf8a790b67ef2e902d2bc04046f02/static/xsd/SearchResults.xsd");
    }

    private void setSchemaLocation(String mSchemaLocation) {
        this.mSchemaLocation = mSchemaLocation;
    }

    @Element private Request request;

    @Element private Message message;

    @Element (required = false) private Response response;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    @Override public String toString() {
        return "ClassPojo [request = "
                + request
                + ", message = "
                + message
                + ", response = "
                + response
                + "]";
    }
}
