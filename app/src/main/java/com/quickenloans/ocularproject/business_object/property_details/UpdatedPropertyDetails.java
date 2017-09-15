package com.quickenloans.ocularproject.business_object.property_details;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

public class UpdatedPropertyDetails {

    @Attribute(name = "schemaLocation")
    @Namespace(reference = "http://www.zillow.com/static/xsd/UpdatedPropertyDetails.xsd /vstatic/e6e5f302965f32ad16114f7a97ba3d89/static/xsd/UpdatedPropertyDetails.xsd", prefix = "xsi")
    private String mSchemaLocation;

    public UpdatedPropertyDetails() {
        setSchemaLocation("http://www.zillow.com/static/xsd/UpdatedPropertyDetails.xsd /vstatic/e6e5f302965f32ad16114f7a97ba3d89/static/xsd/UpdatedPropertyDetails.xsd");
    }

    private void setSchemaLocation(String mSchemaLocation) {
        this.mSchemaLocation = mSchemaLocation;
    }

    @Element
    private Request request;
    @Element
    private Message message;
    @Element (required = false)
    private Response response;

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

}
