package semana08;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        Thread cajero1 = new Thread(new Cajero(cuenta, 500), "Cajero-1");
        Thread cajero2 = new Thread(new Cajero(cuenta, 400), "Cajero-2");
        Thread cajero3 = new Thread(new Cajero(cuenta, 300), "Cajero-3");

        cajero1.start();
        cajero2.start();
        cajero3.start();

        try {
            cajero1.join();
            cajero2.join();
            cajero3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Saldo final en la cuenta: " + cuenta.getSaldo());
    }
}

