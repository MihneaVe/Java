package com.unibuc.pao.ex3;

public class ParentsClass {

    ParentsClass(){
        System.out.println("ParentsClass constructor");
    }

    public void doSomething(){
        System.out.println("Do something in ParentsClass");
    }
    protected void doSomethingProtected(){
        System.out.println("Do something protected in ParentsClass");
    }
    
    // private void doSomethingPrivate(){
    //     System.out.println("Do something private in ParentsClass");
    // }

    void doSomethingDefault(){
        System.out.println("Do something default in ParentsClass");
    }
}
