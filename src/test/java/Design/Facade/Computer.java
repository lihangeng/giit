package Design.Facade;

public class Computer {
	
	private CPU cpu;
	
	private Memory memory;
	
	private Disk disk;

	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.disk = new Disk();
	}
	
	public void startup() {
		cpu.startup();
		memory.startup();
		disk.startup();
	}
	
	public void shutdown() {
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
	}
}
