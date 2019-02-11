package com.company.kctofel;

import org.jfugue.player.Player;

public class NoteDriver {

    public static void main (String[] args) {

        Note tuning = new Note("E", .5);

        double seconds = tuning.getLength();
        //String note = tuning.getValue();

        System.out.println("The first note is " + seconds + " seconds long.");
        System.out.println("The note played is a " + tuning.getValue());

        tuning.setValue("A#");

        System.out.println("The note played is a " + tuning.getValue());

        Player player = new Player();
        player.play(tuning.toString());
    }   // end main

}