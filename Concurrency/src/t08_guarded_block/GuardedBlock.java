package t08_guarded_block;

public class GuardedBlock {
    boolean joy = false;

    /*public synchronized notifyJoy() {
    joy = true;
    notifyAll();
}*/

    public synchronized void guardedJoy() {
    // This guard only loops once for each special event, which may not
    // be the event we're waiting for.
        while(!joy) {
         try {
                wait();
            } catch (InterruptedException e) {}
     }
        System.out.println("Joy and efficiency have been achieved!");
    }



}
