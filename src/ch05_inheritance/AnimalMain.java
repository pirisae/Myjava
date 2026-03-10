package ch05_inheritance;

public class AnimalMain {
    static void main() {
        // 클래스이름 객체이름 = new  생성자 이름();
        Dog retriver = new Dog();
        retriver.name = "김리트리버";
        retriver.age = 2;
        retriver.feed = " 건식 사료";
        retriver.guide = false;

        System.out.println("객체 정보");
        System.out.println(retriver.toString());


        retriver.display();
        retriver.eat();
        retriver.bark();

        Dog maltese = new Dog();
        maltese.name ="이말티즈";
        maltese.age = 7;
        maltese.feed = " 습식 사료";
        maltese.guide =true;
        System.out.println(maltese.toString());
        maltese.display();
        maltese.eat();
        maltese.bark();


        Cat russian = new Cat();
        russian.name = "박러시안";
        russian.age = 3;
        russian.feed = " 고등어";
        russian.indoor = true;
        russian.display();
        russian.eat();
        russian.bark();

        Cat persian = new Cat();
        persian.name = "박페르시안";
        persian.age = 6;
        persian.feed = " 갈치";
        persian.indoor = false;
        persian.display();
        persian.eat();
        persian.bark();

    }
}
