package Water;

public class Watcher implements AbstractWatcher {

	@Override
	public void update() {

		System.out.println("watcher updated!");
	}

}
