package com.quickenloans.ocularproject.business_object.solution_engine;

public class SolutionEngineResponse
{
    private String[] Events;

    private SolutionEngineData SolutionEngineData;

    private String From;

    private MessageInformation MessageInformation;

    public String[] getEvents ()
    {
        return Events;
    }

    public void setEvents (String[] Events)
    {
        this.Events = Events;
    }

    public SolutionEngineData getSolutionEngineData ()
    {
        return SolutionEngineData;
    }

    public void setSolutionEngineData (SolutionEngineData SolutionEngineData)
    {
        this.SolutionEngineData = SolutionEngineData;
    }

    public String getFrom ()
    {
        return From;
    }

    public void setFrom (String From)
    {
        this.From = From;
    }

    public MessageInformation getMessageInformation ()
    {
        return MessageInformation;
    }

    public void setMessageInformation (MessageInformation MessageInformation)
    {
        this.MessageInformation = MessageInformation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Events = "+Events+", " +
                "SolutionEngineData = "+SolutionEngineData+", " +
                "From = "+From+", " +
                "MessageInformation = "+MessageInformation+"]";
    }
}

