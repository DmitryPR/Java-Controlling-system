package computerAudioSystem;

public class Main {

	static final Instrument mixer = new Instrument();
	static final Worker worker = new Worker();
	static final Signal signal = new Signal();

	public static void main(String[] args) {

		Main.worker.setName("Dmitry");
		Main.mixer.setName("Yamaha");
		Main.signal.sendFromPeople(10, 12, 22);
		Main.mixer.getSetUpParameteres();
		Main.signal.sendFromAudioSystem(12, 33, 55);
		Main.worker.getSetUpParameteres();

	}
}
