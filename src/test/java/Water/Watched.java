package Water;

import java.util.ArrayList;
import java.util.List;

public class Watched implements AbstractWatched {
	
	private List<AbstractWatcher> list = new ArrayList<AbstractWatcher>();

	@Override
	public void addWatcher(AbstractWatcher abstractWatcher) {

		list.add(abstractWatcher);
	}

	@Override
	public void deleteWatcher(AbstractWatcher abstractWatcher) {

		list.remove(abstractWatcher);
	}

	@Override
	public void deleteAllWatcher() {

		list.clear();
	}

	@Override
	public void updateStatus() {

		System.out.println("status changed!");
		for(AbstractWatcher watcher:list) {
			watcher.update();
		}
	}

}
