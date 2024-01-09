public class Worker {
    private OnTaskErrorListener errorCallback;
    private OnTaskDoneListener callback;

    public Worker(OnTaskErrorListener errorCallback, OnTaskDoneListener callback) {
        this.errorCallback = errorCallback;
        this.callback = callback;
    }

    public void start() {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            count++;
            if (count == 34){
              errorCallback.onError("Task " + i + " is error");
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}




