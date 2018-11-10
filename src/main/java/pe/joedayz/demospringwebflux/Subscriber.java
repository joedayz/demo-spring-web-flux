package pe.joedayz.demospringwebflux;

public class Subscriber {
    public static void multiplicar(Integer n) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Multiplicar " + n * n);
    }
}
