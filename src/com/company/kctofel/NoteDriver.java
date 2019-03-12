/**
 * Class for a Note driver
 *
 * Kevin C. Tofel
 * February 21, 2019
 * Updated March 11, 2019
 *
 */


package com.company.kctofel;

import java.util.Arrays;

public class NoteDriver {

    public static void main (String[] args) {

        // Generate five note objects
        Note tuning = new Note();
        Note tuning2 = new Note(44, 0.125);
        Note tuning3 = new Note(-19, 0.06125);
        Note tuning4 = new Note(44, .50);
        Note tuning5 = new Note(1,.25);

;       // Gather Notes into an array
        Note[] sounds = new Note[]{tuning, tuning2, tuning3, tuning4, tuning5};


            Arrays.sort(sounds); // Sort and/or sub-sort based on length of note, then by frequency

            // For testing: print sorted notes
            for (Note element : sounds)
                System.out.println("Note value: " + element.value + "\t\tNote length " + element.length + "\t\tNote frequency " + element.getFrequency(element.value) + " Hz");


    }   // end main

}
