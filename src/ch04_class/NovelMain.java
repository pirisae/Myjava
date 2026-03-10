package ch04_class;

public class NovelMain {
    static void main(String[] args) {
        Novel asdf = new Novel("", "", "", 1, "");

    int size = 4;
    Novel[] novellist = new Novel[size];
    novellist[0] = new Novel("삼국지", "나관중", "역사 소설", 120, "중국어" );
    novellist[1] = new Novel("운수좋은날", "현진건", "근대 소설", "한국어" );
    novellist[2] = new Novel("백년의 고독", "가르시아 마르케스", "마술적 사실주의", "스페인어");
    novellist[3] = new Novel("햄릿", "셰익스피어", "비극", 1, "영어" );


        for (int i = 0; i < novellist.length; i++) {
            System.out.println((i+1) + "번째 소설 정보");
            novellist[i].display();
        }
    }
}
