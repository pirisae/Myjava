package ch02_control_statement;

public class TotalExam01 {
    static void main(String[] args) {
        String name = "김철수";
        int kor = 85, eng = 70, math = 90;
        double _grade = (kor + eng + math)/3.0;
                System.out.println("이름 : " + name);
        String message ;
        System.out.printf("국어 : %d, 영어 : %d, 수학 : %d ", kor, eng, math);

        System.out.printf("총점 : %d, 평균 : %.3f", kor+eng+math, _grade);
        /*String grade;
        if (_grade >= 90) {
            System.out.println("A");
        } else if (_grade < 90 && _grade >=80) {
            System.out.println("B");
        } else if (_grade < 80 && _grade >=70 ) {
            System.out.println("C");
        } else if (_grade < 70 && _grade >=60) {
            System.out.println("D");
        } else if (_grade < 60) {
            System.out.println("F");
        } else {
            System.out.println("잘못된 입력입니다.");
        }
        */

        /*switch(grade){
            case "A" : case "B" :
                message = "참 잘 하셨습니다";
                System.out.printf("message");
            case "C" : case "D" :
                message = "조금만 더 노력하세요" ;
                System.out.printf("message");
            case "F" :
                message = "다음 학기에 재수강하세요";
                System.out.printf("message");
        }
*/
    }
}


/*
이름과 국어, 영어, 수학 점수를 이용하여 학점을 매기세요.
학점은 세 과목의 평균을 이용하여 매기세요.

String name = "김철수";
int kor = 85, eng = 70, math = 90 ;

String grade ; // 학점 변수

String message = "" ;

학점이 "A" 또는 "B"이면 "참 잘 하셨습니다."를 message 변수에 저장한다.
학점이 "C" 또는 "D"이면 "조금만 더 노력하세요."를 message 변수에 저장한다.
학점이 "F"이면 "다음 학기에 재수강하세요."를 message 변수에 저장한다.
그 외의 값이 입력되면 "잘못된 입력입니다."를 message 변수에 저장한다.

출력 예시
이름 : 김철수님
국어 : 85점, 영어 : 70점, 수학 : 90점
총점 : 245점, 평균 : 81.66666
학점 : B
메시지 : 참 잘 하셨습니다.
*/