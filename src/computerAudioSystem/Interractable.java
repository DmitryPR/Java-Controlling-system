package computerAudioSystem;

public interface Interractable {

	void sendFromPeople(int channelID, int sliderID, int volumeLevel);

	void receiveFromAudioSystem(int channelID, int sliderID, int volumeLevel);

}
