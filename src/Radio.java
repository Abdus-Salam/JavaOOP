public class Radio extends Electronics implements Signal{

	public Radio(String os, String resolution, int ram, int rom, double processor) {
		super(os, resolution, ram, rom, processor);
	}

	@Override
	public void signalType() {
		System.out.println("Analog signal");
	}
}
