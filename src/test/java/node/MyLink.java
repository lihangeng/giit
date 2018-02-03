package node;

public class MyLink {
	
	Node head = null;
	/**
	 * 链表中的节点，data代表节点的值，next是指向下一个节点的引用
	 * 
	 * @author 17051548
	 *
	 */
	class Node{
		Node next = null;//节点的引用，指向下一个节点
		int data;//本节点对象
		
		public Node(int data) {
			this.data = data;
		}
	}
	/**
	 * 向链表中插入数据，插入一个数据需要遍历整个链表？
	 * 
	 * @param d
	 */
	public void addNode(int d) {
		Node newNode = new Node(d);
		if(head == null) {
			head = newNode;
			return;
		}
		Node tmp = head;
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = newNode;
	}
	/**
	 * 删除index个节点
	 * 
	 * @param index
	 * @return
	 */
	public boolean deleteNode(int index) {
		if(index < 1 || index > length()) {
			return false;
		}
		if(index == 1) {
			head = head.next;
			return true;
		}
		int i = 1;
		Node preNode = head;
		Node curNode = preNode.next;
		while(curNode != null) {
			if(i == index) {
				preNode.next = curNode.next;
				return true;
			}
			preNode = curNode;
		
		}
		return false;
	}
	/**
	 * 返回节点长度
	 * 
	 * @return
	 */
	public int length() {
		int length = 0;
		Node tmp = head;
		while(tmp != null) {
			length ++;
			tmp = tmp.next;
		}
		return length;
	}
}
