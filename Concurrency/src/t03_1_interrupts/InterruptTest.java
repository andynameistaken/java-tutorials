package t03_1_interrupts;

public class InterruptTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {

            System.out.println("run()");
            System.out.println("Going to sleep for 1000ms");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted");
            }

        });

        t1.start();
        t1.interrupt();
        System.out.println(t1.getState());


//        We can decide what to do with interruption

        new Thread
                (
                        () ->
                        {
                            System.out.println("Runnable::run()");
                            System.out.println("Going to sleep for 1000ms and throw custom" +
                                    "exception after that");

                            try
                            {
                                Thread.sleep(1000);
                                throw new InterruptedException();
                            } catch (InterruptedException e)
                            {
                                System.out.println("In exceception");
                                       new Thread( () -> {
                                    System.out.println("Another thread in exception");
                                }).start();
                            }
                        }

                ).start();



    }
}
