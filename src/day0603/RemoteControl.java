package day0603;

public interface RemoteControl {
	int MAX_VOLUME  = 10;
	int MIN_VOLUME = 0;
	
	void trunOn();
	void turnOff();
	void setVolume(int volume);
}

