/**
 *
 * Implementation of a music note class that accepts a piano note number
 * and determines the letter value, tone, duration and frequency
 *
 * Kevin C. Tofel
 * February 14, 2019
 * Updated March 11, 2019
 *
 * https://github.com/kevinctofel/CIS111B_Week4.git
 *
 */

package com.company.kctofel;

import java.util.HashMap;

public class Note implements Comparable<Note> {

    protected int value;
    protected double length;
    protected int octave;

    private HashMap<Integer, String> noteNumber;

    {
        noteNumber = new HashMap<Integer, String>();

        noteNumber.put(-9, "C"); // These are values for octave 4
        noteNumber.put(-8, "C#");
        noteNumber.put(-7, "D");
        noteNumber.put(-6, "D#");
        noteNumber.put(-5, "E");
        noteNumber.put(-4, "F");
        noteNumber.put(-3, "F#");
        noteNumber.put(-2, "G");
        noteNumber.put(-1, "G#");
        noteNumber.put(0, "A");
        noteNumber.put(1, "A#");
        noteNumber.put(2, "B");

    }

    private HashMap<Double, String> noteDuration;

    {
        noteDuration = new HashMap<Double, String>();

        noteDuration.put(1.0, "whole");
        noteDuration.put(0.50, "half");
        noteDuration.put(0.25, "quarter");
        noteDuration.put(0.125, "eighth");
        noteDuration.put(0.06125, "sixteenth");
    }

    /**
     * Default constructor
     */
    public Note() {
        setValue(0); // Set to middle C
        setLength(0.5);
        setOctave();
    }

    /**
     * Constructor that accepts a note number and duration
     *
     * @param value An integer representing the note number with A5 = 0
     * @param length A double representing the value of beats in a measure
     *
     */
    public Note(int value, double length) {
        setValue(value);
        setLength(length);
        setOctave();
    }

    /**
     * Method to calculate the frequency of a note
     *
     * @param value An integer representing the note number with A5 = 0
     * @return A double calculation of the note frequency in Hz
     *
     */
    public double getFrequency(int value) {

        return (Math.pow(2,(this.value / 12.0))) * 440;
    }

    /**
     * Method to set the octave of a note based on its integer value
     */
    public void setOctave()
    {
        this.octave = 4;
        int offset = this.value;
        while (offset < -9 && offset <= 2) {
            offset += 12;
            this.octave --;
        }
        while (offset > 2 && offset >= -9 ) {
            offset -= 12;
            this.octave ++;
        }
    }

    /**
     * Method to get the octave of a note based on its integer value
     * @return An int representing the note octave
     */
    public int getOctave() {
        int octave = 4;
        int offset = this.value;
        while (offset < -9) {
            offset += 12;
            octave --;
        }
        while (offset > 2 ) {
            offset -= 12;
            octave ++;
        }

        return octave;

    }

    /**
     * Method to set the integer value of a note
     * @param value
     */
    public void setValue(int value) {
            this.value = value;
    }

    /**
     * Method to set the length of a note
     * @param duration A double representing the duration of note in one measure
     */
    public void setLength(double duration) {
            this.length = duration;
    }

    /**
     * Method to get the String name of a note
     * @return The String note name
     */
    public String getName(){
        int offset = value;
        while (offset < -9) {
            offset += 12;
        }
        while ( offset> 2 ) {
            offset -= 12;
            }
        return noteNumber.get(offset);
        }

    /**
     * Method to get the numeric value of a note
      * @return An integer representing the note
     */
    public int getValue() {

        return this.value;
    }

    /**
     * A method to convert the numeric note duration to a string repesentation
     * @return The string of the note duration in one measure
     */
    public String getLength() {
        return noteDuration.get(this.length);

    }

    /**
     * A method to determine if a note is natural or share
     * @param note The String representation of a note
     * @return A string for the note step
     */
    public String getHalfStep(String note) {

        if (note.contains("#")) {
            return "sharp";
        } else
            return "natural";

    }

    /**
     * Compare method to sort notes by length and (if equal length) frequency
     * @param other The note to compare to
     * @return -1.0,1 depending on length/frequency value
     */
    @Override
    public int compareTo(Note other) {

        int result = Double.compare(this.length, other.length);
//
        if (result == 0){
            return Double.compare(this.getFrequency(value), ((other.getFrequency(other.value))));
        }
        else
            return result;
    }

} // end class
