package ru.job4j;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j");
        context.refresh();
        Store store = context.getBean(Store.class);
        store.add("Ilia Shaidurov");
        Store another = context.getBean(Store.class);
        another.getAll().forEach(System.out::println);
    }
}
