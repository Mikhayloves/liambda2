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
            if (count == 33){
              errorCallback.onError("Task " + i + " is done");
            }
            callback.onDone("Task " + i + " is done");
        }
    }
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }
    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }
}




