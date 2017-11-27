package Design.Memento;

public class Test {

	public static void main(String[] args) {
		
		/*创建原始类对象*/
		Original original = new Original("egg");
		/*创建备忘录*/
		Storage storage = new Storage(original.createMemento());
		System.out.println("初始值为："+original.getValue());
		original.setValue("niu");
		System.out.println("修改后值为:"+original.getValue());
		/*回复原始类的值*/
	    original.restoreMemento(storage.getMemento());
	    System.out.println("回复后的值为:"+original.getValue());
		
	}

}
