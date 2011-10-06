package computerAudioSystem;

abstract public class People {

}

class Worker extends People {
	public Worker() {
	}

	private String name;
	private int volumeLevel;
	private int channelID;
	private int sliderID;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void setUpParameteres(int ChannelID, int SliderID, int VolumeLevel) {
		this.channelID = ChannelID;
		this.sliderID = SliderID;
		this.volumeLevel = VolumeLevel;

	}

	public void getSetUpParameteres() {

		System.out.println(this.getName() + " " + this.channelID + " "
				+ this.sliderID + " " + this.volumeLevel);
	}

	public void setSliderID(int SliderID) {
		this.sliderID = SliderID;
	}

	public int getSliderID() {
		return this.sliderID;
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

	public void receiveFromAudioSystem(int channelID, int sliderID,
			int volumeLevel) {
		this.setUpParameteres(channelID, sliderID, volumeLevel);
		System.out
				.println("Worker has received the parameteres and they are applied");
	};
}
