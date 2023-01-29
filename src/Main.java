public class Main {

    public static void main (String[] args) {
        int ticket = 25000;
        int mile = 1;
        int price = 20;
        int bonus = ticket / price * mile;

        System.out.println("Количество бонусных миль: ");
        System.out.println((bonus) + " миль(и)");
    }
}
