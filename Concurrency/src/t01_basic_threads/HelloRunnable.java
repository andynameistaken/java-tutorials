package t01_basic_threads;

/*
PROCESSES:

        A process has a self-contained execution environment. A process generally has a complete,
         private set of basic run-time resources; in particular, each process has its own memory space.
        Processes are often seen as synonymous with programs or applications. However, what the user sees as
        a single application may in fact be a set of cooperating processes. To facilitate communication between
        processes, most operating systems support Inter Process Communication (IPC) resources,
         such as pipes and sockets. IPC is used not just for communication between processes on the same system,
        but processes on different systems.

        Most implementations of the Java virtual machine run as a single process.
        A Java application can create additional processes using a ProcessBuilder object.

THREADS:

        Threads are sometimes called lightweight processes. Both processes and threads provide an execution environment,
         but creating a new thread requires fewer resources than creating a new process.
        Threads exist within a process — every process has at least one.
         Threads share the process's resources, including memory and open files.
         This makes for efficient, but potentially problematic, communication.

        Multithreaded execution is an essential feature of the Java platform. Every application has at
         least one thread — or several, if you count "system" threads that do things like memory management
          and signal handling. But from the application programmer's point of view, you start with just one thread,
          called the main thread. This thread has the ability to create additional threads, as we'll demonstrate
          in the next section.

*/

public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        new Thread(new HelloRunnable()).start();


//        Java <= 7

        Thread t1 = new Thread((new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        }));


        Thread t2 = new Thread(()->{
            System.out.println("Thread is running");
        });
    }

}