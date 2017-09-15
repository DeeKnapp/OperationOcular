package com.quickenloans.ocularproject.business_object.zestimate;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Created by dknapp on 7/28/17.
 */

@Root(name = "Zestimate:zestimate")
public class ZestimateResponse {
    @Attribute(name = "schemaLocation")
    @Namespace(reference = "http://www.zillow.com/static/xsd/Zestimate.xsd /vstatic/ae1bf8a790b67ef2e902d2bc04046f02/static/xsd/Zestimate.xsd", prefix = "xsi")
    private String mSchemaLocation;


    public ZestimateResponse() {
        setSchemaLocation("http://www.zillow.com/static/xsd/Zestimate.xsd /vstatic/ae1bf8a790b67ef2e902d2bc04046f02/static/xsd/Zestimate.xsd");
    }

    private void setSchemaLocation(String schemaLocation) {
        this.mSchemaLocation = schemaLocation;
    }

    @Element(name = "message")
    private Message message;

    @Element(name = "response")
    private Response response;
    //
    @Element(name = "request")
    private Request request;

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

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
    //
    //@Override
    //public String toString() {
    //    return "ClassPojo [message = " + message + ", response = " + response + ", request = " + request + "]";
    //}
}