package com.catchingnow.tinyclipboardmanager;

import java.util.Date;

/**
 * Created by heruoxin on 15/1/24.
 * Altered by MehrunesTenets 02/23/16
 */
public class ClipObject {

    public final static String markStar = "☆★☆";

    protected String text;
    protected Date date;
    protected boolean star;
    protected String name;

    public ClipObject(String text, Date date) {
        this.text = text;
        this.date = date;
        this.star = false;
        this.name = text;
    }
    public ClipObject(String text, Date date, boolean star) {
        this.text = text;
        this.date = date;
        this.star = star;
        this.name = text;
    }
    public String getText() {
        return text;
    }
    public Date getDate() {
        return date;
    }
    public  boolean isStarred() {
        return star;
    }

    /**
     * Return name of ClipObject
     * Added by MehrunesTenets 02/23/16
     * @return name of the ClipObject
     */
    public String getName() { return name; }

    /**
     * Set the name of the ClipObject
     * Added by MehrunesTenets 02/23/16
     * @param name the new name for the ClipObject
     */
    public void setName(String name)   { this.name = name; }
    public ClipObject setStarred(boolean isStarred) {
        this.star = isStarred;
        return this;
    }
}

