package ch02_control_statement;

public class While01 {
    static void main(String[] args) {
        int total = 0 ;

        int i = 1;
        while (i < 11){ // for<- 반복횟수가 정해져 잇는 경우 while <- 반복횟수가 정해져 있지 않은 경우

            total+=i;
            i++;
        }
        System.out.println("총합01 : " + total);

        total = 0;
        i = 1; //초기식
        while(i<101){ //조건식
            total+=i;
            i+=3; //증감식
        }
        System.out.println("총합02 : " + total);

        total = 0;
        i = 97;
        while(i>1){
            total+=i;
                    i-=5;
        }
        System.out.println("총합03 : " + total
        );
        total = 0;
        i = 1;
        while(i<101){
            total+=i*i;
            i+=5;
        }
        System.out.println("총합04 : " + total);

    }
}
