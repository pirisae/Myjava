package ch02_control_statement;

import java.util.Scanner;

public class While03 {
    static void main(String[] args) {
        int answer = 40 ; //컴퓨터가 생각하고 있는 숫자

        //바코드 스캐너 scan울 준비합니다.
        Scanner scan = new Scanner(System.in);

        while(true){ // endless while loop
            System.out.println("1부터 100사이의 정수 1개를 입력하세요.");
            int input = scan.nextInt(); //사용자가 입력한 숫자
            System.out.println("입력한 숫자 : " + input);

            if(answer == input){ //맞춘 경우
                System.out.println("정답입니다.");
                break;
            }else if(input<answer){ //정답이 큰 경우
                System.out.println(input + "보다 큰 숫자입니다.");

                            }else{ //정답이 작은 경우
                System.out.println(input + "보다 더 작은 숫자입니다.");
            }


        }
    }
}
