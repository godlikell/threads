

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        Klass k1 = new Klass();
        k1.start();
        Thread k2 = new Thread(new Run());
        k2.start();
        k1.join();
        k2.join();
        System.out.println("main stop");
    }
}


class Klass extends Thread {
        @Override
        public void run() {
            for (int i=0; i<=10; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Potok Klass: " + i);
            }
        }
    }
class Run implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<=10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Potok Run: " + i);
        }
    }
}