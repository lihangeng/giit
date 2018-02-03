package node;

public class Test {

	public static void main(String[] args) {

		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("hello");
		list.add("world!");
		list.add("123");
		list.add("234");
		System.out.println(list);
	}

}
