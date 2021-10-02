package com.company;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @org.junit.jupiter.api.Test
    void isEmptyTest() throws Exception {

        //stack is empty
        Stack emptyStack = new Stack();
        assertTrue(emptyStack.isEmpty());

        //stack has items
        Stack nonEmptyStack = new Stack();
        nonEmptyStack.push(1);
        assertFalse(nonEmptyStack.isEmpty());


        //stack is full, and another item is trying to be added.
        Stack full = new Stack();
        assertThrows(Exception.class , () -> {
            for (int i = 0; i < 51; i++)
            {
            full.push(i);
            }
            } , "Exception on " + "push: stack full");
    }


    @org.junit.jupiter.api.Test
    void isFull() throws Exception{

        //stack is full
        Stack full = new Stack();
        for(int i = 0; i < 50; i++)
        {
            full.push(i);
        }
        assertTrue(full.isFull());


        //stack has an item
        Stack notFull = new Stack();
        notFull.push(2);
        assertFalse(notFull.isFull());

        //stack is empty
        Stack empty = new Stack();
        assertFalse(empty.isFull());
    }

    @org.junit.jupiter.api.Test
    void push() throws Exception
    {
        //checking if items are being added correctly
        Stack s = new Stack();
        s.push(0);
        assertEquals(0, s.peek());

        Stack si = new Stack();
        for(int i = 1; i < 51; i++)
        {
            si.push(i);
        }

        assertEquals( 50 ,si.peek());

        Stack full = new Stack();
        assertThrows(Exception.class , () -> {
            for (int i = 0; i < 51; i++)
            {
                full.push(i);
            }
        } , "Exception on " + "push: stack full");
    }

    @org.junit.jupiter.api.Test
    void popAll() throws Exception
    {
        Stack s = new Stack();
        s.push(1);
        s.popAll();
        assertTrue(s.isEmpty());

        Stack si = new Stack();
        si.popAll();
        assertTrue(s.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void pop() throws Exception
    {
        Stack s = new Stack();

        s.push(1);

        //checking if item is 1
        assertEquals(1, s.peek());

        s.pop();

        //checking if item was popped
        assertTrue(s.isEmpty());
        s.push(1);
        s.push(2);
        s.pop();
        s.pop();
        assertTrue(s.isEmpty());

        Stack empty = new Stack();
        assertThrows(Exception.class, () -> empty.peek(), "Exception on" + "pop: Stack empty");
    }

    @org.junit.jupiter.api.Test
    void peek() throws Exception {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        assertEquals(2, s.peek());

        Stack empty = new Stack();
        assertThrows(Exception.class, () -> empty.peek(), "Exception on" + "peek: Stack empty");
    }
}