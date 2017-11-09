package Design.Iterator;

public interface Collection {
	
	public Iterator iterator();
	/**
	 * 取得集合元素
	 * @param i
	 * @return
	 */
	public Object get(int i);
	/**
	 * 取得集合大小
	 * @return
	 */
	public int size();

}
