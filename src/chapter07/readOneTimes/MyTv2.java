package chapter07.readOneTimes;

public class MyTv2 {
    boolean isPowerOn;
    int channel;
    int volume;
    int prevChannel; // 이전 채널

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public MyTv2() {
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        if (channel < MIN_CHANNEL || channel > MAX_CHANNEL) return;
        this.prevChannel = this.channel;
        this.channel = channel;
    }

    public void setVolume(int volume) {
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) return;
        this.volume = volume;
    }

    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}
