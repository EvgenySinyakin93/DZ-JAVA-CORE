package JavaWorker;
public class Main {
    public static void main(String[] args) {
//        определите переменную listener типа OnTaskDoneListener через лямбда-выражение:
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener errorListener = System.out::println;

//        Далее создайте экземпляр класса Worker и передайте в конструктор класса listener:
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}


