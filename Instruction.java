/***********************************************************************
 * /* Author: Filip Segota
 * /* Class: CSC 122, Fall 2020
 * /* Assignment: Lab 1: Turing Machine
 * /* File: Specific turing machine instruction
 * /
 ***********************************************************************/
public class Instruction implements InstructionInterface {
   // field variables
   int direction, newState, currentState;
   char newChar, currentChar;

   // constructors
   public Instruction() {
      currentState = 0;
      currentChar = '0';
      direction = 0;
      newState = 0;
      newChar = '0';
   }

   public Instruction(int cs, char cc, int d, int ns, char nc) {
      currentState = cs;
      currentChar = cc;
      direction = d;
      newState = ns;
      newChar = nc;
   }

   public Instruction(String s) {
      String[] st;
      st = s.split(":");
      currentState = Integer.parseInt(st[0]);
      currentChar = st[1].charAt(0);
      direction = Integer.parseInt(st[2]);
      newState = Integer.parseInt(st[3]);
      newChar = st[4].charAt(0);
   }

   // accessors
   public int getDirection() {
      return direction;
   }

   public int getNewState() {
      return newState;
   }

   public char getNewChar() {
      return newChar;
   }

   // methods
   public boolean equals(int os, char oc) {
      if (os == currentState && oc == currentChar)
         return true;
      else
         return false;
   }

   public String toString() {
      String s;
      s = Integer.toString(currentState) + ":" + currentChar + ":" +
            direction + ":" + newState + ":" + newChar;
      return s;
   }
}