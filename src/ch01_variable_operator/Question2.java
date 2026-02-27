package ch01_variable_operator;

public class Question2 {
    static void main() {
        int x =3, y=5, z;
        z= x++ + --y ;
        System.out.println("x : " + x); // x = x +1 = 3 +1 =4
        System.out.println("y : " + y); // y = 5 - 1 =4
        System.out.println("z : " + z); // z = 3 + 4 = 7

        z += --x + y++ ;

        System.out.println("x : " +x); // x = x - 1 = 4 - 1 = 3
        System.out.println("y : " +y); // y = y + 1 = 4 + 1 = 5
        System.out.println("z : " +z); // z = 7 + 3 + 4 = 14
    }
}
