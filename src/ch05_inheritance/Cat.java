package ch05_inheritance;
//상속을 해주는 Animal 클래스를 Dog 클래스가 상속을 받습니다


    public class Cat extends Animal{
    boolean indoor ; // 애완묘, 길고양이

        @Override
        public void bark() {
        System.out.println(super.name + "이(가) 야옹하고 짖습니다.");
        }

        @Override
        public void display() {
            super.display();
            if(indoor){
                System.out.println("애완용 여부 : 애완용");
            }else{
                System.out.println("애완용 여부 : 길고양이");
            }





        }

//                public void display(){
//                       super.display();
//                    System.out.println("애완 여부 : " + indoor);
//        }
}
