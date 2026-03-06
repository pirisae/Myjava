package ch03_array;

import java.util.Scanner;

public class StudentExam2 {
    static void main(String[] args) {
        int total = 0;
        double average = 0;


        Scanner scan = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = scan.nextLine();
        int [] jumsu = new int[3];

        for (int i = 0; i < jumsu.length ; i++) {
            System.out.print("점수 입력 : ");
            jumsu[i] = scan.nextInt();

            {
                total += jumsu[i];
                average =total/(i+1.0);
            }




        }
        System.out.println();
        System.out.println("학생의 정보");
        System.out.printf("이름 : %s  총점 : %d 평균 : %.3f", name, total, average);


    }
}
