public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        //int percent = 1;
        if (percent <= 1) {
            percent = 0;
            System.out.println("Ваш бонус равен " +percent);
            return percent;
        }
        long bonus = amount * percent / 100 / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
            System.out.println("Ваш бонус равен " +bonus);
            return bonus;
        }
        System.out.println("Ваш бонус равен " +bonus);
        return bonus;
    }
}



