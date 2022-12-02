package ru.job4j;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        ui.add("Ilia Shaidurov");
        ui.print();
        ui.askStr("Console input work");

    }
}
