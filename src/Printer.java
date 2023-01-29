public class Printer extends Electronics implements Signal, HybridPrinter{

	public Printer(String os, String resolution, int ram, int rom, double processor) {
		super(os, resolution, ram, rom, processor);
	}

	@Override
	public void signalType() {
		System.out.println("Digital signal");
	}
	
	

}
