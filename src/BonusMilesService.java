public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20; // 1 миля за каждые 20 рублей
        int miles = price / bonus; // расчёт бонуса
        return miles; // Возврат результата
    }
}
