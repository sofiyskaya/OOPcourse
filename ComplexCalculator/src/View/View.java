package View;

import java.util.Scanner;

import Controller.iGetView;

public class View implements iGetView {

    @Override
    public String prompt(String msg) {
        Scanner iScan = new Scanner(System.in);
        System.out.println(msg);
        return iScan.nextLine();
    }


    @Override
    public String msgOnInvite() {
        return "Калькулятор комплексных чисел!\n====================================";
    }

    @Override
    public String displaySolved(String arg1, String arg2, String operation, String result) {
        return msgOnResult() + arg1 + " " + operation + " " + arg2 + " = " + result;
    }

    @Override
    public String msgOnBadCommand() {
        return "Такой операции нет!";
    }

    @Override
    public String msgOnNewCalculation() {
        return "\nСледующий расчет: (Yes/No): ";
    }

    @Override
    public String msgOn1stArgument() {
        return "Введите первое число (действительное или комплексное с мнимой частью при i): ";
    }

    @Override
    public String msgOn2ndArgument() {
        return "Введите второе число (действительное или комплексное с мнимой частью при i): ";
    }


    @Override
    public String msgOnOperation() {
        return "Введите операцию для вычисления (доступны '+', '-', '*' и '/'): ";
    }

    @Override
    public String msgOnBadNumber() {
        return "Введенная строка не является числом!";
    }

    @Override
    public String msgOnResult() {
        return "Результат: ";
    }

    @Override
    public String msgOnExit() {
        return "Выполняется выход из приложения...";
    }

}