package org.designpatterns.singleton;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance();
        System.out.println(firstInstance.hashCode());

        Singleton secondInstance = Singleton.getInstance();
        System.out.println(secondInstance.hashCode());
    }
}