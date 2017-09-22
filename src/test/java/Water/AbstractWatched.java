package Water;

public interface AbstractWatched {
	
	public void addWatcher(AbstractWatcher abstractWatcher);
	
	public void deleteWatcher(AbstractWatcher abstractWatcher);
	
	public void deleteAllWatcher();
	
	public void updateStatus();

}
