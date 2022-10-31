public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        //abstrac sınıflar newlenemez.
        GameCalculator[] gameCalculators = new GameCalculator[]{new WomanGameCalculator(),new KidsGameCalculator(),new ManGameCalculator()};
        for (GameCalculator gameCalculator :  gameCalculators){
            gameCalculator.hesapla();
        }
    }
}
