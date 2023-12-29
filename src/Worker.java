import java.util.function.*;

public class Worker {
    private OnTaskErrorListener errorCallback;
    private OnTaskDoneListener callback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }


    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + i + " is done");
        }
    }
    //TODO: данный метод реализует именно ту задачу которая была поставлена
    public void setErrorCallback() {
        for (int i = 0; i < 34; i++) {
            errorCallback.onError("Task " + i + " is done");
        }
        errorCallback.onError("Task " + "33 " + "is error");
    }
}

