# TuringMachine_CSC122  
## Info
**Author:**
Filip Segota  
**Class:**
CSC 122 (Programming 2), Fall 2020  
**Assignment:**
Turing Machine Lab  

## Overview
Create two components of a Turing machine (Part A and Part B). Part A is to code the Instruction and Instructions class. Part B is to implement instructions using Linked List (there is no driver for it). Tape and Turing Machine classes, Interfaces, and a driver code are given by professor (Dr. Cathy Bareiss).  

## Program Summary
  - Get the name of the Turing machine program  
  - Build the machine  
  - While the machine is in a running state (no error and not a terminating state):  
    - Get the current status of the machine (state, and what is under the read/write head of the tape)  
    - Find the appropriate instruction  
    - Update the machine based on that instruction:  
      - Change the state  
      - Change what is under the read/write head  
      - Move the read/write head  
    - Upon termination, report:  
      - Termination status  
      - Current tape (along with the location of the read/write head)  
- A state of -1 is a successful termination  
- A state of -2 is a failed termination  
- An instruction is of the form: (current state):(current character):(direction):(new state):(new character)  
- While by definition, a tape is infinite on both ends, one may assume it will never grow more than 30000 in either direction (and never larger than 30000) to begin. The tape is made up of Unicode characters  
- Direction for moving the tape:  
  - -1 (one position to the left)  
  - 0 (no movement)  
  - 1 (one position to the right)  
- There is one sample input file provided (TuringTest.txt)  
