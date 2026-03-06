package ch04_class;

public class NoraeMain {
    static void main(String[] args) {
        Norae bulsi = new Norae();
        Norae mangrove;
        mangrove = new Norae();

        bulsi.title = "불시";
        bulsi.setSinger("터치드");
        bulsi.genre = "락";
        bulsi.setTime(215);
        bulsi.nation = "한국어";

        System.out.println("제목 : " + bulsi.title);
        System.out.println("가수명 : " + bulsi.getSinger());
        System.out.println("장르 : " + bulsi.genre);
        //double result = bulsi.time1(bulsi.time);
        //System.out.println("재생시간 : " + bulsi.time/60 + "분" + bulsi.time%60 + "초");
        String result = bulsi.Plus5();
        System.out.println("재생시간 : " + result);
        System.out.println("언어 : " + bulsi.nation);
        System.out.println();

        // 메소드 호출


        mangrove.title = "맹그로브";
        mangrove.setSinger("윤하");
        mangrove.genre = "락";
        mangrove.setTime(186);
        mangrove.nation = "한국어";

        mangrove.Display();
    }
}
