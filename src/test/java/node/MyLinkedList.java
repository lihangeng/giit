package node;

import java.util.Iterator;

public class MyLinkedList<E> {
	
	int size = 0;
	
	Node<E> first;
	
	Node<E> last;
	
	int modCount = 0;
	
	public MyLinkedList() {
	}
	
	/**
	 * 在链表的尾部新增一个元素
	 * 
	 * @param e
	 * @return
	 */
	public boolean add(E e) {
		linkLast(e);
		return true;
		
	}
	/**
	 * 添加为为最后一个元素
	 * @param e
	 */
	private void linkLast(E e) {
		final Node<E> l = last;
		final Node<E> newNode = new Node<>(l,e,null);
		last = newNode;
		if(l == null) {
			first = newNode;
		}else {
			l.next = newNode;
		}
		size++;
		modCount++;
	}
	
	public void clear() {
		for(Node<E> x = first; x != null;) {
			Node<E> next = x.next;
			x.item = null;
			x.next = null;
			x.prev = null;
			x = next;
		}
		first = last = null;
		size = 0;
		modCount++;
	}

	private static class Node<E>{
		E item;
		Node<E> next;
		Node<E> prev;
		
		Node(Node<E> prev,E elemet,Node<E> next){
			this.item = elemet;
			this.next = next;
			this.prev = prev;
		}
		
	}
	
}
