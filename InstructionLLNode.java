/***********************************************************************
 * /* Author: Filip Segota
 * /* Class: CSC 122, Fall 2020
 * /* Assignment: Lab 2: Turing Machine changes
 * /* File: Turing machine instruction node
 * /
 ***********************************************************************/
public class InstructionLLNode {
    InstructionInterface instruction;
    InstructionLLNode next;

    // constructors
    public InstructionLLNode() {
        instruction = null;
        next = null;
    }

    public InstructionLLNode(InstructionInterface instruction, InstructionLLNode next) {
        this.instruction = instruction;
        this.next = next;
    }

    public InstructionLLNode(InstructionInterface instruction) {
        this.instruction = instruction;
        next = null;
    }

    // accessors
    public InstructionInterface getInstruction() {
        return instruction;
    }

    public InstructionLLNode getNext() {
        return next;
    }

    // mutators
    public void setInstruction(InstructionInterface instruction) {
        this.instruction = instruction;
    }

    public void setNext(InstructionLLNode next) {
        this.next = next;
    }
}