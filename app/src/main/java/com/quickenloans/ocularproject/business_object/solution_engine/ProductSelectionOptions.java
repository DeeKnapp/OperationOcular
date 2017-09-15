package com.quickenloans.ocularproject.business_object.solution_engine;

public class ProductSelectionOptions
{
    private String[] Filters;

    private Tags[] Tags;

    private boolean IncludeVA_ARM;

    private boolean IncludeVA_Fixed;

    private boolean IncludeARM;

    private boolean IncludeFixed;

    private boolean IsClassicOutputFormat;

    public String[] getFilters ()
    {
        return Filters;
    }

    public void setFilters (String[] Filters)
    {
        this.Filters = Filters;
    }

    public Tags[] getTags ()
    {
        return Tags;
    }

    public void setTags (Tags[] Tags)
    {
        this.Tags = Tags;
    }

    public boolean getIncludeVA_ARM ()
    {
        return IncludeVA_ARM;
    }

    public void setIncludeVA_ARM (boolean IncludeVA_ARM)
    {
        this.IncludeVA_ARM = IncludeVA_ARM;
    }

    public boolean getIncludeVA_Fixed ()
    {
        return IncludeVA_Fixed;
    }

    public void setIncludeVA_Fixed (boolean IncludeVA_Fixed)
    {
        this.IncludeVA_Fixed = IncludeVA_Fixed;
    }

    public boolean getIncludeARM ()
    {
        return IncludeARM;
    }

    public void setIncludeARM (boolean IncludeARM)
    {
        this.IncludeARM = IncludeARM;
    }

    public boolean getIncludeFixed ()
    {
        return IncludeFixed;
    }

    public void setIncludeFixed (boolean IncludeFixed)
    {
        this.IncludeFixed = IncludeFixed;
    }

    public boolean getIsClassicOutputFormat ()
    {
        return IsClassicOutputFormat;
    }

    public void setIsClassicOutputFormat (boolean IsClassicOutputFormat)
    {
        this.IsClassicOutputFormat = IsClassicOutputFormat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Filters = "+Filters+", " +
                "Tags = "+Tags+", " +
                "IncludeVA_ARM = "+IncludeVA_ARM+", " +
                "IncludeVA_Fixed = "+IncludeVA_Fixed+", " +
                "IncludeARM = "+IncludeARM+", " +
                "IncludeFixed = "+IncludeFixed+", " +
                "IsClassicOutputFormat = "+IsClassicOutputFormat+"]";
    }
}

