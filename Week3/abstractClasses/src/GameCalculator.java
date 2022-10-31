public abstract class GameCalculator {
    public abstract void hesapla(); //hesapla var ama herkes kendisine göre override edicek anlamına geliyor.
    public final void gameOver() {
        System.out.println("Oyun bitti");
    }
}
