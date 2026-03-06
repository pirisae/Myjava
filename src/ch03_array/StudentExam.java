package ch03_array;

import java.util.Scanner;

public class StudentExam {
    static void main(String[] args) {
        int total = 0;
        int kor = 0, eng = 0, math = 0;
        double average = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = scan.nextLine();
        int [] jumsu = {kor, eng, math};

        for (int i = 0; i < jumsu.length ; i++) {
            System.out.print("점수 입력 : ");
            jumsu[i] = scan.nextInt();

            {
                total += jumsu[i];
                average =total/(i+1);
            }




        }
        System.out.println();
        System.out.println("학생의 정보");
        System.out.printf("이름 : %s  총점 : %d 평균 : %.3f", name, total, average);

    }
}
