package com.company.kctofel;

//import org.jfugue.player.Player;

public class NoteDriver {

    public static void main (String[] args) {

        Note tuning = new Note();

        String tuningDuration = tuning.getLength();
        String tuningName = tuning.getName() + tuning.getOctave();
        String tuningTone = tuning.getHalfStep(tuning.getName());
        double tuningFreq = tuning.getFrequency(tuning.getValue());

        Note tuning2 = new Note(30, 0.125);

        String tuning2Duration = tuning2.getLength();
        String tuning2Name = tuning2.getName() + tuning2.getOctave();
        String tuning2Tone = tuning2.getHalfStep(tuning2.getName());
        double tuning2Freq = tuning2.getFrequency(tuning2.getValue());

        Note tuning3 = new Note(-19, 0.06125);


        String tuning3Duration = tuning3.getLength();
        String tuning3Name = tuning3.getName() + tuning3.getOctave();
        String tuning3Tone = tuning3.getHalfStep(tuning3.getName());
        double tuning3Freq = tuning3.getFrequency(tuning3.getValue());

        Note test = new Note();

//        Player player = new Player();
//        player.play(tuning.toString());
    }   // end main

}