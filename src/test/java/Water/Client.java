package Water;

import java.util.Locale;

public class Client {

	public static void main(String[] args) {

		AbstractWatched watched = new Watched();
		
		AbstractWatcher watcher1 = new Watcher();
		AbstractWatcher watcher2 = new Watcher();

		watched.addWatcher(watcher1);
		watched.addWatcher(watcher2);
		
		watched.updateStatus();
	}

}
