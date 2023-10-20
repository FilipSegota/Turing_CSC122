/***********************************************************************
 * /* Author: Cathy Bareiss
 * /* Class: CSC 122, Fall 2020
 * /* Assignment: Lab 1: Turing Machine
 * /* File: Interrface for the turing machine set of instructions
 * /
 ***********************************************************************/
public interface InstructionsInterface {

    public void add(InstructionInterface newI);

    public void add(int os, char oc, int d, int ns, char nc);

    public void add(String st);

    public InstructionInterface find(int os, char oc);

}