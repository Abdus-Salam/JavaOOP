// Encapsulated the Electronics class. Binding the data with method. if you remove private keyword before variable. it will break the encapsulation properties.
public class Electronics {
	private String os;
	private String resolution;
	private int ram;
	private int rom;
	private double processor;
	private double price;

	
	public Electronics(String os, String resolution, int ram, int rom, double processor) {
		this.os = os;
		this.resolution = resolution;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public double getProcessor() {
		return processor;
	}

	public void setProcessor(double processor) {
		this.processor = processor;
	}

	public double getPrice() {
		return price;
	}

	// Polymorphism: compile-time polymporhism
	// method overloading
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	// @endMethodOverloading
	
	// polymorphism : we will override from child cass. runtime-polymorphism
	public void doRender() {
		System.out.println("Rendering the electronics set");
	}
}
