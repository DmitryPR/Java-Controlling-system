package computerAudioSystem;

public interface Audiable {

	void sendFromAudioSystem(int channelID, int sliderID, int volumeLevel);

	void receiveFromPeople(int channelID, int sliderID, int volumeLevel);

}
