public class Worker {
    //        Добавьте в класс Worker переменную callback типа OnTaskDoneListener:
    private OnTaskDoneListener callback;
    private OnTaskErrorListener  errorCallback;

    //        Передайте в класс Worker ее значение через конструктор:
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    //        Смоделируйте выполнение классом Worker какой либо работы, например:
    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is error");
            } else {
                callback.onDone("Task " + i + " is done");
            }
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










