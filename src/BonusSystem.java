public class BonusSystem {
    public static void main(String[] args) {
        double currentBalance = 100.0; //текущий баланс
        double replenishmentAmount = 1500.0; //сумма пополнения баланса
        if (replenishmentAmount > 1000)
        {
            double bonusAmount = 100.0; //стоимость одного бонусного рубля
            currentBalance += replenishmentAmount + (replenishmentAmount / bonusAmount);
        }
        else
        {
            currentBalance += replenishmentAmount;
        }
        System.out.print(currentBalance);
    }
}
