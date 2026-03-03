package ch01_variable_operator;

public class OperatorEx {
    static void main() {
        int a = 3 - -2, b = 3 ;
        int x = (a >= b) ? 5 : (a+2);

        x += ++a ;
        System.out.println(x);
        System.out.println(a);

        int y = ++a;
        System.out.println(y);
        y += a + --b ;
        System.out.println(y);
        // y = 16, x = 11, a = 7, b =2

        char ch3 = 'D' ;
                int z = ch3 >= 'A' && ch3 <= 'Z' ? --y : x + 2;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        int result = 0 ;
        result = x > y ? z-y : x+z ;
        System.out.println("result : " + result);
    }
}
