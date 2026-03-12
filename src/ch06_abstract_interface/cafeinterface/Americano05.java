package ch06_abstract_interface.cafeinterface;

public class Americano05 extends Beverage05 implements WaterAdjustable { // 인터페이스를 상속받으려면 implements를 뒤에
    private double waterAmount;

    public Americano05(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }

    @Override
    public void drink() { // 이 메소드는 추상 메소드를 구체화한 메소드입니다.
        System.out.println("물의 양이 " + waterAmount + "ml인 아메리카노" + "를 뜨거운 물과 함께 마십니다.");

    }

    @Override
    public String toString() {
        return super.toString() + "\nAmericano05{" +
                "물의 양 = " + waterAmount +
                '}';
    }

    @Override //인터페이스 관련 오버라이드
    public void adjustwater(double amount) {
        this.waterAmount += amount;
        System.out.println("물 추가 : " + amount + "ml");
        System.out.println("현재 물의 양 : " + this.waterAmount);
    }
}
