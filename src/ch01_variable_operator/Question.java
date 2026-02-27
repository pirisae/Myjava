package ch01_variable_operator;

public class Question {
    static void main() {
        String name ;
        double korean, english, average ;

        name = "홍길동" ;
        korean = 40.0 ;
        english = 43.0 ;
        average = (korean + english) /2 ;

        System.out.println("이름 : " + name);
        System.out.println("국어 : " + korean);
        System.out.println("영어 : " + english);
        System.out.println("평균 : " + average);
    }
}
