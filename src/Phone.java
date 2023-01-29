// inheritance-polymorphism-abstraction
public class Phone extends Electronics implements Signal{
	public Phone(String os, String resolution, int ram, int rom, double processor) {
		super(os, resolution, ram, rom, processor);
	}
	
	// Runtime polymorphism
	@Override
	public void doRender() {
		System.out.println("printer render");
	}

	@Override
	public void signalType() {
		System.out.println("Digital signal");
	}

}
