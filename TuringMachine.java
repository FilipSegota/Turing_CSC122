
/***********************************************************************
/* Author:      Cathy Bareiss
/* Class:       CSC 122, Fall 2020
/* Assignment:  Lab 1: Turing Machine
/* File:        Turing Machine
/***********************************************************************/
import java.util.Scanner;

public class TuringMachine {
    public static final int REJECT = -2;
    public static final int ACCEPT = -1;
    Tape myTape;
    InstructionsInterface myInsts;
    int state;

    // CONSTRUCTORS
    // instantiate and initialize the tape
    // instantiate and load all the instructions
    // set the state to the starting state (0)
    public TuringMachine(Scanner indata) {
        String str;

        str = indata.nextLine();
        myTape = new Tape(str);
        myInsts = new Instructions();
        while (indata.hasNext()) {
            str = indata.nextLine();
            myInsts.add(str);
        }
        state = 0;
    }

    // MUTATORS

    // update -> executes one iteration of the machine
    // get the current state and current char of the tape
    // find the appropriate instruction
    // if it exists
    // update the tape, move the head, change the state
    // else
    // set state to rejection
    public void update() {
        int cs;
        char cc;
        InstructionInterface myInst;

        cs = state;
        cc = myTape.get();
        myInst = myInsts.find(cs, cc);
        if (myInst == null)
            state = REJECT;
        else {
            myTape.change(myInst.getNewChar());
            myTape.move(myInst.getDirection());
            state = myInst.getNewState();
        }
    }

    // run until the state is at accept or reject, continue to execute iterations
    public void run() {
        while (state >= 0)
            update();
    }

    // HELPERS

    // toString
    // Display the current state and tape
    public String toString() {
        String result;

        result = "State: " + state + "\n" + myTape.toString();
        return result;
    }
}