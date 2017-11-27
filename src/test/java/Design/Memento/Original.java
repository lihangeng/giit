package Design.Memento;

/**
 * 原始类
 * @author 17051548
 *
 */
public class Original {
	
	private String value;
	
	public Original(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Memento createMemento() {
		
		return new Memento(value);
	}
	
	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}

}
