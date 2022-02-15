public class Main {

    public static void main(String[] args) {
	WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
    womanGameCalculator.hesapla();
    womanGameCalculator.gameOver();
//abstract sınıflar asla new yapılamaz new yapılabilmesi için içnin zorunlu olarak doldurulması gerekir
//    GameCalculator gameCalculator=new GameCalculator() {
//        @Override
//        public void hesapla() {
//
//        }
//    };   gibi
        GameCalculator gameCalculator=new WomanGameCalculator();
    }
}
