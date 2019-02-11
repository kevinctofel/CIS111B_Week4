package com.company.kctofel;

import java.util.HashMap;

public class Note {

    private String value;
    private double length;
    private HashMap<String, Integer> noteNumber;

    {
        noteNumber = new HashMap<String, Integer>();
        noteNumber.put("C", 0);
        noteNumber.put("C#", 1);
        noteNumber.put("D", 2);
        noteNumber.put("D#", 3);
        noteNumber.put("E", 4);
        noteNumber.put("F", 5);
        noteNumber.put("F#", 6);
        noteNumber.put("G", 7);
        noteNumber.put("G#", 8);
        noteNumber.put("A", 9);
        noteNumber.put("A#", 10);
        noteNumber.put("B", 11);

    }

    // May need to change value from int to String to represent value and octave
    // Could be hashmap with key being the letter / value being the number
    public Note() {
        setValue("E"); // Set to A above middle C
        setLength(0.25);
    }

    public Note(String  value, double length) {
        setValue(value);
        setLength(length);
    }

    public void setValue(String value) {
        //if (value >= 0) // Change this to allow for pos and neg range on keyboard
            this.value = value;
    }

    public void setLength(double length) {
        if (length >= 0.0 && length <= 1.0)
            this.length = length;
    }

    public Integer getValue(){

        return noteNumber.get(value);
    }

    public double getLength(){
        return this.length;

        // METHODS to do yet:
        // return name of note
        // return natural or sharp
        // return note frequency using 440 * (2^ (n/12)) formula

    }
} // end class
