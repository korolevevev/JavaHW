package Sem1;

public class Main {

    public static int a21(int a) {
        return a - 21;
    }

    public static double arithm(int a, int b){
        return (a + b) /2;

    }
    public static double geom(int a, int b) {
        return Math.sqrt(a*b);
    }

    public static double leng(double x0, double y0, double x1, double y1){
        return Math.sqrt(Math.pow((x1-x0) ,2)+Math.pow((y1-y0), 2));
    }



    public static void main(String[] args) {
        // Первое задание
        System.out.println("Hello world");
        // Второе задание
        int a = 2;
        System.out.println(a);
        //Третье задание
        int b = 0;
        b+=1;
        b++;
        ++b;
        System.out.println(b);
        // Четвертое задание /
        int c = 10;
        int d = 20;
        c = c + d - (d = c);
        System.out.println(c);
        System.out.println(d);
        // Пятое задание /
        int katet_a = 23;
        int katet_b = 14;
        System.out.println(Math.sqrt(Math.pow(katet_a, 2) + Math.pow(katet_b, 2)));
        // Шестое задание /
        int number = 234;
        System.out.println(number%10);
        // Седьмое задание /
        System.out.println(((number%100)-number%10)/10);
        // Восьмое задание /
        System.out.println(number/10);
        // Девятое задание /
        System.out.println(a21(22));
        // Десятое задание /
        System.out.println(arithm(19, 10));
        // Одиннадцатое задание/
        System.out.println(geom(4,4));
        // Двенадцатое задание */
        System.out.println(leng(2,2, 2, 4));


    }

}
