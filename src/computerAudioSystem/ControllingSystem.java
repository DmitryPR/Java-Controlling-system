package computerAudioSystem;

import java.util.Random;

public class ControllingSystem implements Audiable, Interractable {

	public void sendFromAudioSystem(int channelID, int sliderID, int volumeLevel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveFromPeople(int channelID, int sliderID, int volumeLevel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveFromAudioSystem(int channelID, int sliderID,
			int volumeLevel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendFromPeople(int channelID, int sliderID, int volumeLevel) {
		// TODO Auto-generated method stub

	}

}

class Signal extends ControllingSystem {
	enum SignalSource {
		OSC, MIDI
	}

	Random rand = new Random();
	SignalSource signalSource;
	private int signalID;
	private int volumeLevel;
	private int channelID;
	private int sliderID;

	public void sendFromPeople(int channelID, int sliderID, int volumeLevel) {
		Signal signal = new Signal();
		signal.setSignalID(rand.nextInt(100));
		signal.setUpParameteresOSC(channelID, sliderID, volumeLevel);
		System.out.println("Worker is sending a signal named "
				+ signal.getSignalID());
		signal.convertOscToMidi();
		Main.mixer.receiveFromPeople(channelID, sliderID, volumeLevel);
		// hello world git

	}

	private void setUpParameteresOSC(int channelID, int sliderID,
			int volumeLevel) {
		this.channelID = channelID;
		this.sliderID = sliderID;
		this.volumeLevel = volumeLevel;
		this.signalSource = SignalSource.OSC;

	}

	public void sendFromAudioSystem(int channelID, int sliderID, int volumeLevel) {
		Signal signal = new Signal();
		signal.setSignalID(rand.nextInt(100));
		signal.setUpParameteresMidi(channelID, sliderID, volumeLevel);
		System.out.println("Instrument is sending a signal named "
				+ signal.getSignalID());
		signal.convertMidiToOsc();
		Main.worker.receiveFromAudioSystem(channelID, sliderID, volumeLevel);

	}

	private void setUpParameteresMidi(int channelID, int sliderID,
			int volumeLevel) {
		this.channelID = channelID;
		this.sliderID = sliderID;
		this.volumeLevel = volumeLevel;
		this.signalSource = SignalSource.MIDI;

	}

	public SignalSource getSignalSource() {
		return signalSource;
	}

	public void setSignalID(int signalID) {
		this.signalID = signalID;
	}

	public int getSignalID() {
		return this.signalID;
	}

	public int getSliderID() {
		return sliderID;
	}

	public void setSliderID(int SliderID) {
		this.sliderID = SliderID;
	}

	public void setVolumeLevel(int VolumeLevel) {
		this.volumeLevel = VolumeLevel;

	}

	public int getVolumeLevel() {
		return this.volumeLevel;
	}

	public void setChannelID(int ChannelID) {
		this.channelID = ChannelID;

	}

	public int getChannelID() {
		return this.channelID;
	}

	public void setSignalSource(SignalSource signalID) {
		this.signalSource = signalID;
	}

	public void convertOscToMidi() {
		this.signalSource = SignalSource.MIDI;
		System.out.println(this.getSignalID()
				+ " was succesfully converted to MIDI");
	}

	public void convertMidiToOsc() {
		this.signalSource = SignalSource.OSC;
		System.out.println(this.getSignalID()
				+ " was succesfully converted to OSC");

	}
}
