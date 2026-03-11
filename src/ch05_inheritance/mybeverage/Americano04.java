package ch05_inheritance.mybeverage;

public class Americano04 extends Beverage04{
    private double waterAmount ; // 투입하는 물의 양

    @Override
    public String toString() {
        String imsi = ",물의 양 : " + waterAmount;
        return super.toString() + imsi;
    }

    public Americano04(String name, double price, double waterAmount){

        super(name, price);
        this.waterAmount = waterAmount ;
    }

    // sip : 홀짝홀짝 마시다
    public void sipAmericano(){
        String message = super.getName()+ "를 홀짝홀짝 마십니다.";//(앞에 super.getname <-원래는 그냥 아메리카노 쳣는데 업어옴
        System.out.println(message);
    }
}
