package Design.Iterator;

public interface Iterator {
	/**
	 * 前移
	 */
	public Object previous();
	/**
	 * 后移
	 * @return
	 */
	public Object next();
	/**
	 * 
	 * @return
	 */
	public boolean hasNext();
	/**
	 * 取得第一元素
	 * @return
	 */
	public Object first();

}
