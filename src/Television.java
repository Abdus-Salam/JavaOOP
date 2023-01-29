// Encapsulate, Inheritance, Abstraction, Polymorphism implement
public class Television extends Electronics implements Signal, Remote{
	private int volume;
	private int channel;
	
	public Television(String os, String resolution, int ram, int rom, double processor) {
		super(os, resolution, ram, rom, processor);
	}
	
	// Encapsulate
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	// @endEncapsulate
	
	// abstraction
	@Override
	public void signalType() {
		System.out.println("Digital signal");
	}
	
	// Remote abstraction
	@Override
	public void increaseVolume() {
		this.volume += this.volume;
	}

	@Override
	public void decreaseVolume() {
		this.volume -= this.volume;
	}

	@Override
	public void channelTuning(int tune) {
		this.channel = tune;
	}
}
