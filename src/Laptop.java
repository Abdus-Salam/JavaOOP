public class Laptop extends Electronics implements Signal{

	public Laptop(String os, String resolution, int ram, int rom, double processor) {
		super(os, resolution, ram, rom, processor);
	}

	@Override
	public void signalType() {
		System.out.println("Digital signal");
	}
	
	@Override
	public String toString() {
		return "Laptop specification - OS : " + this.getOs() + ", resolution: " + this.getResolution();
	}
}
