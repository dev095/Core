package com.company.smurov.practic;

public class ChildAncient extends Ancient{

    int x = 5;

    public ChildAncient() {
        super();
    }

    @Override
    public void hungry() {
        System.out.println("i am child");
        System.out.println(x);
    }
}
