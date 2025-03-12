package com.unibuc.pao.ex3;

public class Main {
    public static void main(String[] args){
        AbstractClass myObject = new AbstractClass(){
        };
        System.out.println(myObject.getClass());
        myObject.nonAbstractMethod();

        ParentsClass myObject2 = new ParentsClass(){
        };
        System.out.println(myObject2.getClass());
        myObject2.doSomething();
        myObject2.doSomethingDefault();
        myObject2.doSomethingProtected();
        // myObject2.doSomethingPrivate(); // Compilation error - private method is not visible

        ChildClass myObject3 = new ChildClass();
        System.out.println(myObject3.getClass());
        myObject3.doSomething();
        myObject3.doSomething("Hello");
        myObject3.doSomethingDefault();
        myObject3.doSomethingProtected();
        // myObject3.doSomethingPrivate(); // Compilation error - private method is not visible

    }
}

