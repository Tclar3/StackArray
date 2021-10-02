package com.company;

public class Stack
{

    /*
    Array implementation of stack
    -Thomas Clarke
     */

    final int MAX_STACK_SIZE = 50;
    private Object[] items;
    private int top;


    public Stack()
    {
        this.items = new Object[MAX_STACK_SIZE];
        this.top = -1;
    }


    //push, pop, peek, popall, isEmpty
    //checks if stack is empty
    public boolean isEmpty()
    {
        return this.top < 0;
    }

    //checks if stack is full
    public boolean isFull()
    {
        return top == MAX_STACK_SIZE-1;
    }

    //places item into stack if not full
    public void push(Object item) throws Exception
    {
        if(!isFull())
            this.items[++top] = item;
        else
            throw new Exception("Exception on " + "push: stack full");
    }

    public void popAll()
    {
        this.items = new Object[MAX_STACK_SIZE];
        this.top = -1;
    }

    public Object pop() throws Exception
    {
        if(!isEmpty())
            return items[top--];
        else
            throw new Exception("Exception on "+ "pop: stack Empty");

    }

    public Object peek() throws Exception
    {
        if(!isEmpty())
            return items[this.top];
        else
            throw new Exception("Exception on "+"peek: Stack empty");
    }






}



