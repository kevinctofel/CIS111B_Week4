package com.company.kctofel;

import java.util.HashMap;

public class Note {

    private int value;
    private double length;
    private HashMap<Integer, String> noteNumber;

    {
        noteNumber = new HashMap<Integer, String>();
        noteNumber.put(0, "C");
        noteNumber.put(1, "C#");
        noteNumber.put(2, "D");
        noteNumber.put(3, "D#");
        noteNumber.put(4, "E");
        noteNumber.put(5, "F");
        noteNumber.put(6, "F#");
        noteNumber.put(7, "G");
        noteNumber.put(8, "G#");
        noteNumber.put(9, "A");
        noteNumber.put(10, "A#");
        noteNumber.put(11, "B");

    }

    // May need to change value from int to String to represent value and octave
    // Could be hashmap with key being the letter / value being the number
    public Note() {
        setValue(9); // Set to A above middle C
        setLength(0.25);
    }

    public Note(int value, double length) {
        setValue(value);
        setLength(length);
    }

    public void setValue(int value) {
        if (value >= 0) // Change this to allow for pos and neg range on keyboard
            this.value = value;
    }

    public void setLength(double length) {
        if (length >= 0.0 && length <= 1.0)
            this.length = length;
    }

    public String getValue(){

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
