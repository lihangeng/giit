package node;

public class MyHashMap<V, K> {
	
	static final int DEFAULT_INITIAL_CAPACITY = 1<<4;
	
	static final int MAXIMUM_CAPACITY = 1<<30;
	
	static final float DEFAULT_LOAD_FACTOR = 0.75f;
	
	final float loadFactor;
	
	public MyHashMap() {
		this.loadFactor = DEFAULT_LOAD_FACTOR;
	}
	
	public V put(K key,V value) {
		return putVal(hash(key),key,value,false,true);
	}

	private V putVal(Object hash, K key, V value, boolean b, boolean c) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object hash(K key) {
		int h;
		return (key == null)? 0 : (h = key.hashCode())^(h>>>16);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
