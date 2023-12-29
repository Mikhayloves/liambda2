import java.util.*;
import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println();
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listener1 = System.out::println;
        Worker worker = new Worker(listener, listener1);
        worker.setErrorCallback();
    }
}

@FunctionalInterface
interface OnTaskDoneListener {
    void onDone(String result);
}

@FunctionalInterface
interface OnTaskErrorListener {
    void onError(String result);
}

