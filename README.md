# CIS111B_Week4
Creating a music note class

Assignment:

Design , implement and test a class that can be used to hold information about a musical note. Test it with an appropriate driver program.

A Note is described by two fields: the value of the note and the length of the note.
A programmer should be able to set and retrieve the length of the note and the value of the note.
The length of a note may be a sixteenth note, eight note, quarter note, half note, or a whole note. 
The note's  value is specified by indicating how far the note lies above or below the A note that orchestras use in tuning (A4 ). In counting "how far", you should include both the white and black notes on a piano. 
The default constructor should set a note to the A above middle C (value = 0) and a length of a quarter note. Include methods to set a note to a specified length and value. Write methods to retrieve information about a note, including methods to:
1. tell you the letter name of the note (A, B , C);
2. tell you whether the note is natural or sharp (ie. white or black on the piano), and
3. tell you the frequency of the note in hertz.  [[ HINT:  To calculate the frequency, use the formual 440 x 2^(n/12) where n is the note number. ]]
Feel free to include other useful methods ! No GUI interface or applet is required but the problem might extend itself to a cute applet in some way... You are encouraged to explore !
TESTING and DOCUMENTATION
Be sure to test, and show me the results.
Document (with javadoc) and comment the code.
