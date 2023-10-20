
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
        Scanner keyboard, file;
        String filename;

        keyboard = new Scanner(System.in);
        System.out.println("What is the name of the file?");
        filename = keyboard.nextLine();
        file = new Scanner(new FileReader(filename));
        machine = new TuringMachine(file);
        machine.run();
        System.out.println(machine.toString());
    }
}
