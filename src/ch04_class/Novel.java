package ch04_class;

public class Novel {
    String title, name, genre, language;
    int vol = 1;


    public Novel(String title, String name, String genre, String language) {
        this.title = title;
        this.name = name;
        this.genre = genre;
        this.language = language;
    }

    public Novel(String title, String name, String genre, int vol, String language) {
        this.title = title;
        this.name = name;
        this.genre = genre;
        this.vol = vol;
        this.language = language;
    }
    public void display(){
        System.out.println("제목 : " + title);
        System.out.println("작가 : " + name);
        System.out.println("장르 : " + genre);
        System.out.println("권수 : " + vol);
        System.out.println("언어 : " + language);
        System.out.println();
    }

}
