public class Main {

    public static void main(String[] args) {

        int initialAmount = 100;
        int investment = 1100;
        int bonus;
        if (investment > 1000) {
            bonus = investment / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);

    }
}