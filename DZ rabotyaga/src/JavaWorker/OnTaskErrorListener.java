package JavaWorker;
@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
