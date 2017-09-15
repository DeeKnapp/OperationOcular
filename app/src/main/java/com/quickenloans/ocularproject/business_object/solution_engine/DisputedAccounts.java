package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/30/17.
 */

public class DisputedAccounts {

    private boolean JumboDisputed;

    private boolean VADisputed;

    private boolean FHADisputed;

    private boolean LPDisputed;

    private boolean DUDisputed;


    public boolean isJumboDisputed() {
        return JumboDisputed;
    }

    public void setJumboDisputed(boolean JumboDisputed) {
        this.JumboDisputed = JumboDisputed;
    }

    public boolean isVADisputed() {
        return VADisputed;
    }

    public void setVADisputed(boolean VADisputed) {
        this.VADisputed = VADisputed;
    }

    public boolean isFHADisputed() {
        return FHADisputed;
    }

    public void setFHADisputed(boolean FHADisputed) {
        this.FHADisputed = FHADisputed;
    }

    public boolean isLPDisputed() {
        return LPDisputed;
    }

    public void setLPDisputed(boolean LPDisputed) {
        this.LPDisputed = LPDisputed;
    }

    public boolean isDUDisputed() {
        return DUDisputed;
    }

    public void setDUDisputed(boolean DUDisputed) {
        this.DUDisputed = DUDisputed;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [JumboDisputed = "+JumboDisputed+", " +
                "VADisputed = "+VADisputed+", " +
                "FHADisputed = "+FHADisputed+", " +
                "LPDisputed = "+LPDisputed+", " +
                "DUDisputed = "+DUDisputed+"]";
    }
}
