package com.quickenloans.ocularproject.business_object.solution_engine;

public class MessageInformation
{
    private String Status;

    private String TransactionID;

    private String MessageTimeDateStamp;

    public String getStatus ()
    {
        return Status;
    }

    public void setStatus (String Status)
    {
        this.Status = Status;
    }

    public String getTransactionID ()
    {
        return TransactionID;
    }

    public void setTransactionID (String TransactionID)
    {
        this.TransactionID = TransactionID;
    }

    public String getMessageTimeDateStamp ()
    {
        return MessageTimeDateStamp;
    }

    public void setMessageTimeDateStamp (String MessageTimeDateStamp)
    {
        this.MessageTimeDateStamp = MessageTimeDateStamp;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Status = "+Status+", TransactionID = "+TransactionID+", MessageTimeDateStamp = "+MessageTimeDateStamp+"]";
    }
}

