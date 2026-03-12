package ch06_abstract_interface.cafeinterface;

public class Cappuccino05 extends Beverage05 implements MilkAddable, FoamAmount{
    private String milkType;
    private double foamAmount; // 거품량

    public Cappuccino05(String name, double price, String milkType, double foamAmount) {
        super(name, price);
        this.milkType = milkType;
        this.foamAmount = foamAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCappuccino05{" +
                "우유 타입='" + milkType + '\'' +
                ", 거품의 양=" + foamAmount +
                "}";
    }

    @Override
    public void drink() {
        System.out.println(super.getName() + "을(를) 슥 마십니다.");
    }

    @Override
    public void Foam(double FoamAmount) {
        System.out.println("거품의 양 : " + FoamAmount + " 을 추가하였습니다.");

        this.foamAmount +=FoamAmount;
        System.out.println("현재 거품의 양 : " + this.foamAmount);


    }

    @Override
    public void changeMilk(String milkType) {
        System.out.println("타입 변경 이전 : " + this.milkType + ", 이후 : " + milkType );
        this.milkType=milkType;

    }
}
