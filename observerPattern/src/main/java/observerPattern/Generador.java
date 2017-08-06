package observerPattern;

import java.util.ArrayList;

public class Generador implements Runnable, ElixirSubject {
	private int elixir = 0;
	private boolean generar = false;
	private ArrayList<ElixirObserver> observers;
	
	public Generador() {
		observers = new ArrayList<ElixirObserver>();
	}
	
	public void start() {
		this.generar = true;
		
		new Thread(this).start();
	}

	public void stop() {
		this.generar = false;
		System.out.println("Elixir: " + elixir);
	}

	public void run() {
		while (generar) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			elixir++;
			
			notifyObservers();
		}
	}
	
	public int getElixir(){
		return elixir;
	}

	public void registerObserver(ElixirObserver observer) {
		observers.add(observer);
	}

	public void removeObserver(ElixirObserver observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (ElixirObserver observer : observers) {
			observer.update(elixir);
		}
		
	}
}
