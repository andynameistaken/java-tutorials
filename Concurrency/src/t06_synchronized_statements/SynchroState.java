package t06_synchronized_statements;

public class SynchroState {
    /*
    Another way to create synchronized code is with synchronized statements.
    Unlike synchronized methods, synchronized statements must specify the object that provides the intrinsic lock:

public void addName(String name) {
    synchronized(this) {
        lastName = name;
        nameCount++;
    }
    nameList.add(name);
}
    */

     class MsLunch {
        private long c1 = 0;
        private long c2 = 0;
        private Object lock1 = new Object();
        private Object lock2 = new Object();

        public void inc1() {
            synchronized(lock1) {
                c1++;
            }
        }

        public void inc2() {
            synchronized(lock2) {
                c2++;
            }
        }
    }

//    Use this idiom with extreme care. You must be absolutely sure that it really
//    is safe to interleave access of the affected fields.
}
