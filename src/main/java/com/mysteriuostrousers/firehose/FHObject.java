package com.mysteriuostrousers.firehose;



import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;



public abstract class FHObject {

    private long              _id;
    private Calendar          _createdAt;
    private ArrayList<String> _errors;



    // region: Constructors

    protected void FHObject() {
        this.setId(-1);
        this.setCreatedAt(null);
        this.setErrors(new ArrayList<String>());
    }

    // endregion



    // region: Getters & Setters

    /**
     * @return The unique ID of the object.
     */
    public long getId() {
        return _id;
    }


    /**
     * @param id
     *   The unique ID of the object.
     */
    public void setId(long id) {
        _id = id;
    }


    /**
     * @return The date & time the object was created on the server.
     */
    public Calendar getCreatedAt() {
        return _createdAt;
    }


    /**
     * @param createdAt
     *   The date & time the object was created on the server.
     */
    public void setCreatedAt(Calendar createdAt) {
        _createdAt = createdAt;
    }


    /**
     * @return The errors the server returned about fields that did not contain valid values.
     */
    public ArrayList<String> getErrors() {
        return _errors;
    }


    /**
     * @param errors
     *   The errors the server returned about fields that did not contain valid values.
     */
    public void setErrors(ArrayList<String> errors) {
        _errors = errors;
    }

    // endregion
}