package com.quickenloans.ocularproject.business_object.solution_engine;

public class Disclaimers
{
    private String Name;

    private String Text;

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String getText ()
    {
        return Text;
    }

    public void setText (String Text)
    {
        this.Text = Text;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Name = "+Name+", " +
                "Text = "+Text+"]";
    }
}


