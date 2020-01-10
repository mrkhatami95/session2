package session2.diamond_problem;

public interface B {

    default void doSomething() {
        System.out.println("Class B something is called");
    }
}
