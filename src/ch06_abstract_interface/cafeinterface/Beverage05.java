package ch06_abstract_interface.cafeinterface;
// 추상 메소드를 포함하는 클래스는 반드시 추상 클래스이어야 합니다. <- abstract class
public abstract class Beverage05 {


    //카페 이름은 객체 생성하지 않아도 접근이 가능하도록 하는 것이 좋겠습니다.(static)
    public static final String STORE_NAME= "G-CAFE";

    public static int beverageCount=0; // 주문한 커피 잔수

    public static int getBeverageCount(){
        return beverageCount;
    }


    private String name ;
    private  double price ;

    public String getName() {
        return name;
    }

    // 모든 음료는 마십니다.
    // 추상 메소드는 중괄호(바디)를 가질 수 없습니다.(추상적이라)
    // 추상 메소드가 들어있는 클래스는 반드시 추상 클래스여야 한다.
    public abstract void drink();

    @Override
    public String toString() {
        return "Beverage05{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    // generate 싫으면 String imsi변수로 해도 됨

    public Beverage05(){

    }

    public Beverage05(String name, double price) {
        this.name = name; //
        this.price = price;

        beverageCount++; //커피잔수 +1
    }
}
