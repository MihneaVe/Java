package com.unibuc.pao.ex3;

public class ParentClass {

    @SuppressWarnings("unused")
    private final int id;

    @SuppressWarnings("unused")
    private final static int staticId;

    ParentClass() {
        this.id = 0;
    }

    static {
        staticId = 7;
    }

    public void doSomething() {
        System.out.println("Do something in ParentClass");
    }

    public ParentClass(int id) {
        this.id = id;
    }

    public void doSomethingPublic() {
        System.out.println("ParentClass.doSomething()");
    }

    protected void doSomethingProtected() {
        System.out.println("ParentClass.doSomethingProtected()");
    }

    @SuppressWarnings("unused")
    private void doSomethingPrivate() {
        System.out.println("ParentClass.doSomethingPrivate()");
    }

    void doSomethingDefault() {
        System.out.println("ParentClass.doSomethingDefault()");
    }
}