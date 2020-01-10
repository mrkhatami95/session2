package session2.diamond_problem;

public class C implements A, B {

    @Override
    public void doSomething() {

        A.super.doSomething();
        B.super.doSomething();

    }

    public static void main(String[] args) {

        new C().doSomething();
    }
}
