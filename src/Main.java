
public class Main {
    public static void main(String[] args) {
        int startScore = 500;
        int replenishmentAmount = 800;
        int bonus = replenishmentAmount / 100 + startScore;
        int total = startScore + replenishmentAmount + bonus;
        if (replenishmentAmount >= 1000) {
            System.out.println("Ваш бонус за пополнение счета составляет: " + bonus);
            System.out.println("Всего на Вашем счету: " + total);
        } else {
            System.out.println("Недостаточно внесено средств на ваш счет для начисления бонусов, всего на счету : " + (startScore + replenishmentAmount));
            System.out.println( "Сумма пополнения счета составляет: " +  replenishmentAmount);
        }
    }
}