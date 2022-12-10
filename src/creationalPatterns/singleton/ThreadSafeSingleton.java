package creationalPatterns.singleton;

public class ThreadSafeSingleton {
    // initialize the instance as null.
    private static ThreadSafeSingleton instance = null;

    // private constructor, so it cannot be instantiated outside this class.
    private ThreadSafeSingleton() {  }

    // check if the instance is null, within a synchronized block. If so, create the object
    public static ThreadSafeSingleton ggetInstanceDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
