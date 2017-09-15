package com.quickenloans.ocularproject.business_object.property_details;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

import java.util.ArrayList;
import java.util.List;

@Root
public class Image {

    @ElementList(entry="url", inline=true)
    public List<String> url = null;
}
