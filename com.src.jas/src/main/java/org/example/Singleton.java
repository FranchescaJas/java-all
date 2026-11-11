package org.example;

/**


 **/

public class Singleton {

    private static Singleton instance;

    //2.
    private Singleton(){
        System.out.println("Singleton instance created");
    }

    //3.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2); // true
    }

}