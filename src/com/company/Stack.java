package com.company;

public class Stack
{

    /*
    Array-based implementation of stack
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
        return (this.top < 0);
    }

    //checks if stack is full
    public boolean isFull()
    {
        return this.top == MAX_STACK_SIZE - 1;
    }

    //places item into stack if not full
    public void push(Object item) throws Exception
    {
        if(!isFull())
            this.items[++top] = item;
        else
            throw new Exception("Exception on " + "push: Stack full");
    }

    //popAll removes all items by creating new array
    public void popAll()
    {
        this.items = new Object[MAX_STACK_SIZE];
        this.top = -1;
    }

    //pop removes last item and returns it
    public Object pop() throws Exception
    {
        if(!isEmpty())
            return this.items[top--];
        else
            throw new Exception("Exception on " + "pop: Stack empty");
    }

    //peek returns last item
    public Object peek() throws Exception
    {
        if(!isEmpty())
            return this.items[top];
        else
            throw new Exception("Exception on " + "peek: Stack empty");
    }


}



