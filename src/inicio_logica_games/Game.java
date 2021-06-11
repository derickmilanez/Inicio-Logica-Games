package inicio_logica_games;

import java.util.ArrayList;

public class Game implements Runnable {
	
	public boolean isRunning;
	private Thread thread;
	
	private ArrayList<Entidade> entidades = new ArrayList<>();
	
	public Game() {
		entidades.add(new Entidade());
		for(int i = 0; i<entidades.size(); i++) {
			entidades.get(0);
		}
	}
	
	
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
	
	public synchronized void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public void tick() {
		System.out.println("tick");
	}
	
	public void render() {
		System.out.println("render");
	}

	@Override
	public void run() {
		while(isRunning){
			tick();
			render();
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			
		}
		
	}

}
