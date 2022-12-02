package ru.job4j;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Ilia Shaidurov");
        ui.add("Artur Ivanov");
        ui.print();
        ui.askStr("Console input work");

    }
}
