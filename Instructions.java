/***********************************************************************
 * /* Author: Filip Segota
 * /* Class: CSC 122, Fall 2020
 * /* Assignment: Lab 1: Turing Machine
 * /* File: Turing machine set of instructions
 * /
 ***********************************************************************/
public class Instructions implements InstructionsInterface {
   // field variables
   InstructionInterface[] instructions;
   int n;
   public static final int DEFAULTMAX = 30000;

   // constructors
   public Instructions() {
      instructions = new InstructionInterface[DEFAULTMAX];
      n = 0;
      for (int i = 0; i < DEFAULTMAX; i++)
         instructions[i] = null;
   }

   public Instructions(int n) {
      instructions = new InstructionInterface[n];
      this.n = 0;
      for (int i = 0; i < n; i++)
         instructions[i] = null;
   }

   // methods
   public void add(InstructionInterface newI) {
      try {
         instructions[n] = newI;
         n++;
      } catch (Exception e) {
         System.out.println("You reached maximum number of instructions!");
      }
   }

   public void add(int os, char oc, int d, int ns, char nc) {
      try {
         instructions[n] = new Instruction(os, oc, d, ns, nc);
         n++;
      } catch (Exception e) {
         System.out.println("You reached maximum number of instructions!");
      }
   }

   public void add(String st) {
      try {
         instructions[n] = new Instruction(st);
         n++;
      } catch (Exception e) {
         System.out.println("You reached maximum number of instructions!");
      }
   }

   public InstructionInterface find(int os, char oc) {
      boolean found;
      int i;

      i = 0;
      found = false;
      while (!found && i < n) {
         if (instructions[i].equals(os, oc))
            found = true;
         else
            i++;
      }
      if (found)
         return instructions[i];
      else
         return null;
   }
}