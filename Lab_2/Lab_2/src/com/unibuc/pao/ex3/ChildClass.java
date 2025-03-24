package com.unibuc.pao.ex3;

public class ChildClass extends ParentClass {
    // constructor(s) default, parameterized, copy constructor

    ChildClass(){
        super();
        System.out.println("ChildClass constructor");
    }

    // override parent method

    @Override
    public void doSomething() {
        System.out.println("Do something in ChildClass");
    }

    // overload parent method

    public void doSomething(String message) {
        System.out.println("Do something in ChildClass with message: " + message);
    }
}
