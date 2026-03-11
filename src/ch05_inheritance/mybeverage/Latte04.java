package ch05_inheritance.mybeverage;

public class Latte04 extends Beverage04{
    private String milkType ; // 우유의 타입

    @Override
    public String toString() {
        String imsi2 = ", 우유의 타입 : " + milkType;
        return  super.toString() +imsi2;
    }

    public Latte04(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }
        public void enjoyLatte(){
            String message = "부드럽고 크리미한 %s를 마십니다.";
            System.out.printf(message, super.getName());
            System.out.println();
        }

}
