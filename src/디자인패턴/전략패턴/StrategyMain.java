package 디자인패턴.전략패턴;

public class StrategyMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("KundolA", 100);
        Item B = new Item("KundolB", 300);

        cart.addItem(A);
        cart.addItem(B);

        //pay by LUNA CARD
        cart.pay(new LUNACardStrategy("wndudzz6@naver.com", "1234"));

        //pay by KAKAO CARD
        cart.pay(new KAKAOCardStrategy("wndud", "1234567890", "123", "1220"));

        //필요한 정보가 다르고 내부적으로 로직이 조금 다를 수도 있지만 cart.pay(정책)을 써서 추상화
    }
}
