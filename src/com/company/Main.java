package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int swt, a, b, year=1794, day= 127;
        float c, y;
        double sotn, des, edn;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите режим домашнего задания от 1 до 10 ");
        swt = scanner.nextInt();

        switch (swt)
        {
            case 1:
                System.out.println("Выделение частного");
                System.out.println("Введите делимое ");
                a = scanner.nextInt();
                System.out.println("Введите делитель ");
                b = scanner.nextInt();
                if (b!= 0){
                    c=a/b;
                    System.out.println(a+"/"+b+"="+c);
                }
                else System.out.println("На ноль делить нельзя!!!");
                break;
            case 2:
                System.out.println("Мини тест на знание истории");
                System.out.println("В каком году основали Одессу?");
                a = scanner.nextInt();
                if(a==year) System.out.println("Правильный ответ))) Умно!!!");
                else System.out.println("Не правильно, на самом деле город основан в "+ year);
                break;
            case 3:
                System.out.println("Расчет скидки на покупку ");
                System.out.println("Вам предоставленная прогрессирующая скидка, введите цену покупки");
                a = scanner.nextInt();
                c = (a>1000) ? a*5/100 : (a>500) ? a*3/100 : 0;
                System.out.println("Скидка составила " + c + " общая сумма = " + (a-c));
                break;
            case 4:
                System.out.println("Проверка на четность ");
                System.out.println("Введите число для проверки");
                a = scanner.nextInt();
                if (a%2 == 0) System.out.println("Число "+ a + "- четное!");
                else System.out.println("Число "+ a +"- нечетное!");
                break;
            case 5:
                System.out.println("Проверка делением на 3 ");
                System.out.println("Введите число для проверки");
                a = scanner.nextInt();
                if (a%3 == 0) System.out.println("Число "+ a + "- делиться на три!");
                else System.out.println("Число "+ a +"- на три нацело не делиться!");
                break;
            case 6:
                float sum;
                b=3;
                System.out.println("Расчет цены разговора по телефону с учетом скидки по дням недели");
                System.out.println("Введите длительность разговора в минутах: ");
                sum = scanner.nextInt();
                System.out.println("Введите день недели при разговоре (1 - понедельник ... 7 - воскресенье");
                day = scanner.nextInt();
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        b=0;
                        break;
                    case 6:
                    case 7:
                        b=1;
                        break;
                    default:
                        b=5;
                        System.out.println("Такого дня не существует)");
                        break;
                }
                if (b==1 || b==0) {
                sum = sum * 3;
                c = (b == 1) ? sum - sum * 20 / 100 : sum;
                System.out.println("При цене 1 минуты зазговора 3 грн, стоимость разговора составит " + c);
            }
                break;
            case 7:
                double w=0, e, sott, dess,ednn, suma;
                System.out.println("Проверка трехсзначного числа ");
                System.out.println("Введите трехзначное число ");
                w = scanner.nextInt();
                sotn = w/100;
                des = (w/10)%10;
                edn = w%10;
                //System.out.println(edn+des+sotn);
                if (w<1000 && w>99) {
                        System.out.println((sotn == edn) ? "Сотни = Единицы" : (sotn < edn) ? "Сотни < Единиц" : "Сотни > Единиц");
                        System.out.println((sotn == edn) ? "Сотни = Десятки" : (sotn < des) ? "Сотни < Десятков" : "Сотни > Десятков");
                        System.out.println((sotn == edn) ? "Десятки = Единицы" : (des < edn) ? "Десятки < Единиц" : "Десятки > Единиц");
                }
                else System.out.println("Введеное число не являеться трехзначным!");
                break;
            case 8:
                System.out.println("Проверка трехсзначного числа 2 ");
                System.out.println("Введите трехзначное число ");

                e = scanner.nextDouble();
                sotn = e/100;
                des = (e/10)%10;
                edn = e%10;
                if (e<1000 && e>99) {
                e = Math.pow(e, 3);
                sott = Math.pow(sotn, 2);
                dess = Math.pow(des, 2);
                ednn = Math.pow(edn, 2);
                suma = sott + dess + ednn;
                System.out.println((suma == e) ? "Сумма кубов = корню" : (suma > e) ? "Сумма кубов > корня" : "Сумма кубов < корня");
            }
                else System.out.println("Введеное число не являеться трехзначным!");
                break;
            case 9:
                float t, x, r;
                System.out.println("Заданее 9)");
                System.out.println("Введите число а");
                x = scanner.nextFloat();
                System.out.println("Введите число b");
                r = scanner.nextFloat();
                if (x < r)
                {
                    t = x;
                    x = (x+r)/2;
                    r = 2 * t * r;
                }
                else
                if (x > r)
                {
                    t = r;
                    r = (x+r)/2;
                    x = 2 * x * t;
                }
                System.out.println(x + "  " + r);
                break;
            case 10:
                System.out.println("Задание 10)");
                System.out.println("Просто наслаждайтесь!");
                System.out.println("При ax^3 + bх = 0  - х в любом случае равен 0 (кроме отрицательных a и b");
            default:
                break;
        }
    }
}
