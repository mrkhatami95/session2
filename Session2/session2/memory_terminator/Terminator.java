package session2.memory_terminator;

import java.util.ArrayList;
import java.util.List;

public class Terminator {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (;;) {
            list.add(1);
        }
    }

}
