package ch02_control_statement;

public class TotalExam02 {
    static void main(String[] args) {
        String message = "안녕하세요.";

        int su = 5;

        for (int i = 1; i <= su; i++) {
            System.out.println(message);

        }
        int dan = 3;
        for (int i = 1; i < 10; i++) {
            dan = 3 * i;
            System.out.println("3 * " + i + " = " + dan);


        }

        int n = 5;
        int total = 0;

        for (int i = 1; i < n+1; i++) {
            total += i;


        }
        System.out.println("1부터 " + n + "까지의 총합은 " + total + "입니다.");


        int star = 12;
        for (int i = 1; i <= star; i++) {
            System.out.print("*");
            if(i%5==0){
                System.out.println("");
            }
        }




        int sumA = 0, sumB = 0;
        int diff =0 ;

        for (int i = 0; i < 51; i++) {
            if(i%3==0){
                sumB += i;
            }else {
                sumA += i;

            }
        }
        diff = sumA - sumB;
        System.out.println("3의 배수의 총합 : " + sumB); //408
        System.out.println("3의 배수가 아닌 정수의 총합 : " + sumA);//867
        System.out.println("차이 : " + diff); //459

        int odd = 0, even = 0;
        total = 0 ;


        }


    }

