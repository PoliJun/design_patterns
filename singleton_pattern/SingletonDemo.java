package singleton_pattern;

/**
 * SingletonDemo
 */
public class SingletonDemo {

    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}