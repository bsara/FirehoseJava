package com.mysteriuostrousers.firehose;


import java.util.Calendar;

public class DNDSettings {

    private int _startHourUTC;
    private int _endHourUTC;
    private boolean _isManuallyTurnedOn;



    // region: Constructors

    public DNDSettings() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 18);

        this.setStartHourUTC(cal.get(Calendar.HOUR_OF_DAY));
        this.setEndHourUTC(cal.get(Calendar.HOUR_OF_DAY));

        this.setIsManuallyTurnedOn(false);
    }

    // endregion



    // region: Getters & Setters

    public int getStartHourUTC() {
        return _startHourUTC;
    }


    public void setStartHourUTC(int startHour) {
        _startHourUTC = startHour;
    }


    public int getEndHourUTC() {
        return _endHourUTC;
    }


    public void setEndHourUTC(int endHour) {
        _endHourUTC = endHour;
    }


    public boolean isManuallyTurnedOn() {
        return _isManuallyTurnedOn;
    }


    public void setIsManuallyTurnedOn(boolean isManuallyTurnedOn) {
        _isManuallyTurnedOn = isManuallyTurnedOn;
    }

    // endregion
}