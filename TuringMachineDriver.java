
/***********************************************************************
/* Author:      Cathy Bareiss
/* Class:       CSC 122, Fall 2020
/* Assignment:  Lab 1: Turing Machine
/* File:        Driver
/***********************************************************************/
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TuringMachineDriver {
    // main:
    // Get the file,
    // Build the machine
    // Run the machine
    // Report the result
    public static void main(String[] args) throws IOException {
        TuringMachine machine;
        Scanner file;

        file = new Scanner(new FileReader("TuringTest.txt"));
        machine = new TuringMachine(file);
        machine.run();
        System.out.println(machine.toString());
    }
}