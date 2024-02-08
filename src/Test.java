public class Test {
    public static void main(String[] args) {
        Runnable run1 = () -> {
            for (int i = 0; i <= 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Potok run1: " + i);
            }
        };


       Thread th1 = new Thread(() ->
        {
            for (int i = 0; i <= 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Potok th1: " + i);
            }

        });
        Thread thread = new Thread(run1);
        thread.start();
        th1.start();
    }


}
