package com.ben.iterator;

/**
 * Created by BEN on 15-Mar-16.
 */
public class Channel {
    private double frequency;
    private ChannelType cType;

    public Channel(ChannelType cType, double frequency) {
        this.cType = cType;
        this.frequency = frequency;
    }

    public ChannelType getcType() {
        return cType;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "cType=" + cType +
                ", frequency=" + frequency +
                '}';
    }
}
