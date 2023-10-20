/***********************************************************************
 * /* Author: Cathy Bareiss
 * /* Class: CSC 122, Fall 2020
 * /* Assignment: Lab 1: Turing Machine
 * /* File: Interface for a specific turing machine instruction
 * /
 ***********************************************************************/
public interface InstructionInterface {

    public int getDirection();

    public int getNewState();

    public char getNewChar();

    public boolean equals(int os, char oc);

    public String toString();
}