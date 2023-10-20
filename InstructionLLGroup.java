/***********************************************************************
 * /* Author: Filip Segota
 * /* Class: CSC 122, Fall 2020
 * /* Assignment: Lab 2: Turing Machine changes
 * /* File: Turing machine set of instructions
 * /
 ***********************************************************************/
public class InstructionLLGroup {
    // field variables
    InstructionLLNode head;

    // constructors
    public InstructionLLGroup() {
        head = null;
    }

    public InstructionLLGroup(InstructionInterface instruction) {
        head = new InstructionLLNode(instruction);
    }

    // methods
    public void add(InstructionInterface newI) {
        InstructionLLNode newLLNode;

        newLLNode = new InstructionLLNode(newI);
        newLLNode.setNext(head);
        head = newLLNode;
    }

    public void add(int os, char oc, int d, int ns, char nc) {
        InstructionLLNode newLLNode;
        Instruction newI;

        newI = new Instruction(os, oc, d, ns, nc);
        newLLNode = new InstructionLLNode(newI);
        newLLNode.setNext(head);
        head = newLLNode;
    }

    public void add(String st) {
        InstructionLLNode newLLNode;
        Instruction newI;

        newI = new Instruction(st);
        newLLNode = new InstructionLLNode(newI);
        newLLNode.setNext(head);
        head = newLLNode;
    }

    public void print() {
        if (head == null)
            return;
        InstructionLLNode temp;

        temp = head;
        while (temp.getNext() != null) {
            System.out.println(temp.getInstruction().toString());
            temp = temp.getNext();
        }
        System.out.println(temp.getInstruction().toString());
    }

    public int size() {
        if (head == null)
            return 0;
        int n;
        InstructionLLNode temp;

        n = 1;
        temp = head;

        while (temp.getNext() != null) {
            n++;
            temp = temp.getNext();
        }
        return n;
    }

    // Search for an instruction using recursion
    public InstructionInterface find(int os, char oc) {
        if (head == null)
            return null;
        while (head.getNext() != null) {
            if (head.getInstruction().equals(os, oc)) {
                return head.getInstruction();
            } else {
                head = head.getNext();
                find(os, oc);
            }
        }
        if (head.getInstruction().equals(os, oc)) {
            return head.getInstruction();
        } else {
            return null;
        }
    }
}