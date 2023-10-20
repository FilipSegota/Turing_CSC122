/******************************************************************************
 * /*
 * /* Author: Dr. Cathy Bareiss
 * /* Email: cathy.bareiss@betheluniversity.edu
 * /* Course: CSC 122
 * /* Description: This is a class for a tape for a Turing machine
 * /*
 ******************************************************************************/
public class Tape {
    String tape;
    int location;

    // CONSTRUCTORS

    // blank tape
    public Tape() {
        tape = "";
        location = -1;
    }

    // tape from a string
    public Tape(String tape) {
        this.tape = tape;
        location = 0;
    }

    // MUTATORS

    // move the tape -> if it is off either end, add a blank and update position
    public void move(int direction) {
        if (direction == 0)
            return;
        location += direction;
        if (location == -1)
            tape = " " + tape;
        if (location == tape.length())
            tape = tape + " ";
        return;
    }

    // change the character at the current position
    public void change(char ch) {
        if (location == 0)
            tape = ch + tape.substring(1, tape.length());
        else if (location == tape.length())
            tape = tape.substring(0, tape.length()) + ch;
        else
            tape = tape.substring(0, location) + ch +
                    tape.substring(location + 1, tape.length());
    }

    // ACCESSORS

    // get the character at the current position
    public char get() {
        return tape.charAt(location);
    }

    // HELPERS

    // the tape (with possible leading and trailing blanks and location of head)
    public String toString() {
        return '"' + tape + '"' + " at location " + location;
    }
}
