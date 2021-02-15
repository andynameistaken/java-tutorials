package t05_0_interference;
public class BalanceThreadFix extends Thread {

	private Balance b;  // referencja do obiektu klasy Balance
	private int count;  // liczba powtórzeń pętli w metodzie run

	public BalanceThreadFix(String name, Balance b, int count) {
		super(name);
		this.b = b;
		this.count = count;
		start();
	}

	public void run() {
		int wynik = 0;
		synchronized(b) {
			for (int i = 0; i < count; i++) {
				wynik = b.balance();
				if (wynik != 0) break;
			}
			System.out.println(Thread.currentThread().getName() +
					" konczy z wynikiem  " + wynik);
		}
	}

	public static void main(String[] args) {

		int tnum = 99999999;         // liczba wątków
		int count = 99999999;// liczba powtórzeń pętli w run()

		// Tworzymy obiekt klasy balance
		Balance b = new Balance();

		// Tworzymy i uruchamiamy wątki
		Thread[] thread = new Thread[tnum];  // tablica wątków
		for (int i = 0; i < tnum; i++)
			thread[i] = new BalanceThreadFix("W"+(i+1), b, count);

		// czekaj na zakończenie wszystkich wątków
		try {
			for (int i = 0; i < tnum; i++) thread[i].join();
		} catch (InterruptedException exc) {
			System.exit(1);
		}
		System.out.println("Koniec programu");
	}
}

