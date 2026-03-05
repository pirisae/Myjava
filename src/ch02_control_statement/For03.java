package ch02_control_statement;

public class For03 {
    static void main(String[] args) {
        // 1 + 2 + 3 + ... + 50 = 1275
        // 2 + 4 + 6 + ... + 100 = 2550
        // 1 + 3 + 5 + ... + 99 = 2500
        // 100 + 95 + 90 + ... + 5 = 1050
        // 2² + 4² + 6² + ... + 20² = 1540
        // 5² + 10² + 15² + ... + 100²= 71750
        int total = 0;
        for (int i = 0; i < 51 ; i++) {
            total+= i;

        }
        System.out.println("총합01 + " + total);

        total=0;
                for (int i = 2; i < 101 ; i+=2) {
            total += i;
                }
        System.out.println("총합02 : " + total);

        total=0;
        for (int i = 1; i < 101; i+=2) {
            total += i;


        }
        System.out.println("총합03 : " + total);

        int even = 0, odd = 0;
        for (int i = 0; i < 101; i++) {
            if (i%2==0){
                even+=i;
            }else{
                odd +=i;
            }


        }
        System.out.println(even);
        System.out.println(odd);

        total = 0;
        for (int i = 100; i > 0; i-=5) {
            total+=i;

        }
        System.out.println("총합04 : " + total);

        total = 0;
        for (int i = 0; i < 21 ; i+=2) {
            total+= i*i;

        }
        System.out.println("총합05 : " + total);

        total=0;
        for (int i = 0; i < 101; i+=5) {
            total+=i*i;

        }
        System.out.println("총합06 : " + total);

        total=0;
        int i = 0;
        while(i<=20){
            total+=i*i;
            i+=2;
        }
        System.out.println("총합05 : " + total);

        total=0;
        for ( i = 1; i < 10; i++) {
            total=2*i;
            System.out.println("2 * " + i + "=" + total);




        }

        }

    }

