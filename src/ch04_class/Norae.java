package ch04_class;

public class Norae {
    String title, genre, nation; //제목
    private String singer;
    private int time;

    public int getTime(){return time;}

    /*public void setTime(int _time) {
        time = _time;
    }
    */

    public void setTime(int time) {
        this.time = time;
    }

    String Plus5() {
        //return x/60 + x%60;
       return time/60 + "분" + time%60 + "초";
    }

    public String getSinger(){
        return singer ;
    }

    public void setSinger(String _singer){
        singer = _singer;
    }



    void Display(){
    System.out.println("제목 : " + title);
    System.out.println("가수명 : " + singer);
    System.out.println("장르 : " + genre);
    System.out.println("재생시간 : " + time/60 +"분" + time%60 + "초");
    System.out.println("언어 : " + nation);
}

}
