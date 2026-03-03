package ch01_variable_operator;

public class CondOper {
    static void main() {
        int x =3 , y = 8, z = 4 ;
        int max = x>y ? x : y ;
        System.out.println(max);
        max = y>z ? y : z ;
        System.out.println("3, 8, 4 중 최대 수는 " + max + " 입니다");
    }
}
