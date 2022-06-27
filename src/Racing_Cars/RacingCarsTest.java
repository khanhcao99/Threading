package Racing_Cars;

public class RacingCarsTest {
    public static void main(String[] args) {
        RacingCars carA = new RacingCars("A");
        RacingCars carB = new RacingCars("B");
        RacingCars carC = new RacingCars("C");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Disrance: 100KM");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
